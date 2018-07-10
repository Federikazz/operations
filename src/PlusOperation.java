<<<<<<< HEAD
static class PlusOperation implements Operations {
    @Override
    public String toString() {
        return "Plus Operation: ";
    }

    public int operation(int[] v1) {
        return v1[0] + v1[1];
    }
    public int getOperationType(){
        return 2;
    }
=======
class PlusOperation implements Operation {
  @Override
  public String toString() {
    return "Plus Operation: ";
  }

  public int operation(int[] v1) {
    return v1[0] + v1[1];
  }

  @Override
  public int getOperationType() {
    return 2;
  }
>>>>>>> 882b3ffd05f2600811593be3aaf18b29119f1b52
}