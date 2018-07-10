import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public interface Operations {
        int operation(int[] v1);
        int getOperationType();
    }

    public static void main(String[] args) {

        Operations[] opsArray = {new PlusOperation()};
        List<Operations> ops = new ArrayList<>();
        ops.add(new PlusOperation());
        ops.add(new MinusOperation());
        ops.add(new DivOperation());
        ops.add(new MultOperation());
        ops.add(new FactOperation());

        for (Operations op : ops) {
            switch (op.getOperationType) {
                case 2:
                    public int operationUpd (int[0],int[1]);
                    break;
                case 1:
                    public int operationUpd (int[0]);
                    break;
            }
            System.out.println(op.toString() + op.operation(10, 3));
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


