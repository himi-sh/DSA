class GFG1 {
    static int fun(int i)
    {
        if (i % 2 == 1) return (i++);
        else return fun(fun(i - 1));
    }
     
    public static void main (String[] args) {
        System.out.println(" " + fun(200) + " ");
    }
}