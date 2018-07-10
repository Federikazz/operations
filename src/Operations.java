import java.util.ArrayList;
import java.util.List;


class Operations {

    static class MinusOperation implements Operation {
        @Override
        public String toString() {
            return "Minus Operation: ";
        }

        public int operation(int[] v1) {
            return v1[0] - v1[1];
        }
    }

    static class MultOperation implements Operation {
        @Override
        public String toString() {
            return "Multiply Operation: ";
        }

        public int operation(int[] v1) {
            return v1[0] * v1[1];
        }
    }

    static class DivOperation implements Operation {
        @Override
        public String toString() {
            return "Divide Operation: ";
        }

        public int operation(int[] v1) {
            return v1[0] / v1[1];
        }
    }

    static class FactOperation implements Operation {
        @Override
        public String toString() {
            return "Factorial Operation: ";
        }

        public int operation(int[] v1) {
            int res = 1;
            for (int i = 1;
                 i <= v1;
                 i++) {
                res *= i;
            }
            return res;
        }
    }

    public static void main(String[] args) {

        Operation[] opsArray = {new PlusOperation()};
        List<Operation> ops = new ArrayList<>();
        ops.add(new PlusOperation());
        ops.add(new MinusOperation());
        ops.add(new DivOperation());
        ops.add(new MultOperation());
        ops.add(new FactOperation());

        for (Operation op : ops) {
            switch (op.getOperationType) {
                case UNARY:
                    public int operation (int[0],int[1]);
                    break;
                case BINARY:
                    public int operation (int[0]);
                    break;
            }
            System.out.println(op.toString() + op.operation(10, 10));
        }
//        Operation summ = new PlusOperation();
//        long result1 = summ.operation(10, 2);
//        System.out.println("The summ is :" + result1);
//
//        Operation minn = new MinusOperation();
//        result1 = minn.operation(10, 2);
//        System.out.println("The div is :" + result1);
//
//        Operation mult = new MultOperation();
//        long result3 = mult.operation(10, 2);
//        System.out.println("The multiplication is :" +result3);
//
//        Operation div = new DivOperation();
//        long result4 = div.operation(10, 2);
//        System.out.println("The division is :" +result4);
//
//        Operation fact = new FactOperation();
//        long result5 = fact.operation(10);
//        System.out.println("The factorial is :" +result5);

    }
}


