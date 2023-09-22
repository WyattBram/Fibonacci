class FibIteration implements IFindFib {

    @Override
    public int calculateFIb(int f) {
        int fib = 0;
        int fib1 =1;
        int fib3 = 0;
        if (f == 1 || f == 2){
            return 1;
        }

        for(int i = 1; i<f; i++){
            fib3 = fib + fib1;
            fib = fib1;
            fib1 = fib3;
        }
        return fib3;
    }
}
