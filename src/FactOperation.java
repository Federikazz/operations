static class FactOperation implements Operations {
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
    public int getOperationType(){
        return 1;
    }
}