package behavioral.strategy;

public class Navigator {

    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String from, String to){
        if (strategy == null){
            System.out.println("Please set a route strategy before building a route.");
            return;
        }
        strategy.buildRoute(from,to);
    }
}
