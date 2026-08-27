package Generation;

import AST.Program;

public record PageModel(
        String outputName,
        Program resolvedTree,
        String fanOutEndpoint,
        String fanOutCollectionKey,
        String fanOutItemName,
        String fanOutKeyField) {
}
