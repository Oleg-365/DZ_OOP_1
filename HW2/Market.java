package HW2;

import java.util.*;

public class Market implements MarketBehavior, QueueBehavior {
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашла в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " покинула магазин");
    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встала в очередь");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрала заказ");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделала заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинула очередь");
        actorsQueue.poll();
    }
}
