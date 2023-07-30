package BehavioralPatterns.StrategyDesignPattern;

public class Context { //Stratejiyi al, onu implement eden hangi sınıf çağırırsa çağırsın onun doOperation'u calisacak
    public Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
