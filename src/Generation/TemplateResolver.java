package Generation;

import AST.BodyNode;
import AST.JinjaBlock;
import AST.JinjaSuperBlock;
import AST.Node;
import AST.Program;

import java.util.ArrayList;
import java.util.List;

public class TemplateResolver {

    public static Program getFullTree(Program base, Program fill) {

        List<JinjaBlock> baseBlocks = new ArrayList<>();
        List<JinjaBlock> fillBlocks = new ArrayList<>();
        getBlock(base, baseBlocks);
        getBlock(fill, fillBlocks);
        for (JinjaBlock baseBlock : baseBlocks) {
            JinjaBlock matchingFillBlock = findBlockByName(fillBlocks, baseBlock.getName().getFullName());

            if (matchingFillBlock == null) {
                continue;
            }

            if (containsSuper(matchingFillBlock)) {
                mergeWithSuper(baseBlock, matchingFillBlock);
            } else {
                replaceContent(baseBlock, matchingFillBlock);
            }
        }

        return base;
    }

    private static JinjaBlock findBlockByName(List<JinjaBlock> blocks, String name) {
        for (JinjaBlock block : blocks) {
            if (block.getName().getFullName().equals(name)) {
                return block;
            }
        }
        return null;
    }

    private static boolean containsSuper(JinjaBlock block) {
        if (block.getSuperBlock() != null) {
            return true;
        }
        List<Node> found = new ArrayList<>();
        collectSuperCalls(block, found);
        return !found.isEmpty();
    }

    private static void collectSuperCalls(Node node, List<Node> found) {
        for (Node child : node.getChildrenSearch()) {
            if (child instanceof JinjaSuperBlock) {
                found.add(child);
            }
            if (!child.getChildrenSearch().isEmpty()) {
                collectSuperCalls(child, found);
            }
        }
    }

    private static void replaceContent(JinjaBlock baseBlock, JinjaBlock fillBlock) {
        List<BodyNode> baseBodies = new ArrayList<>(baseBlock.getBodys());
        for (BodyNode b : baseBodies) {
            baseBlock.removeBody(b);
        }
        for (BodyNode b : fillBlock.getBodys()) {
            baseBlock.addBody(b);
        }
    }

    private static void mergeWithSuper(JinjaBlock baseBlock, JinjaBlock fillBlock) {

        for (BodyNode b : fillBlock.getBodys()) {
            baseBlock.addBody(b);
        }
    }

    public static void getBlock(Node node, List<JinjaBlock> blocks) {
        for (Node child : node.getChildrenSearch()) {
            if (child instanceof JinjaBlock) {
                blocks.add((JinjaBlock) child);
            }
            if (!child.getChildrenSearch().isEmpty()) {
                getBlock(child, blocks);
            }
        }
    }
}
