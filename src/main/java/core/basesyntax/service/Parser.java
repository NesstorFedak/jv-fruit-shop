package core.basesyntax.service;

import core.basesyntax.model.LineData;
import java.util.List;

public interface Parser {
    List<LineData> parse(List<String> list);

    interface OperationHandler {
        boolean operation(LineData lineData);
    }
}
