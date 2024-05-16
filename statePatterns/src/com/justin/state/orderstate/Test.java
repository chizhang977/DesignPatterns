package com.justin.state.orderstate;

// 状态接口
interface OrderState {
    void handleOrder(OrderContext context);
}

// 具体状态类：新建状态
class NewOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in new state. Processing new order...");
        context.setState(new ProcessingOrderState());
    }
}

// 具体状态类：处理中状态
class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in processing state. Processing order...");
        context.setState(new ShippedOrderState());
    }
}

// 具体状态类：已发货状态
class ShippedOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is shipped. Completing order...");
        context.setState(new DeliveredOrderState());
    }
}

// 具体状态类：已交付状态
class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is delivered. Order complete.");
    }
}

// 上下文类
class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewOrderState();  // 初始状态为新建
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    // 订单处理方法
    public void processOrder() {
        state.handleOrder(this);
    }
}

// 测试状态模式
public class Test {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // 模拟订单处理过程
        orderContext.processOrder();  // 新建 -> 处理中
        orderContext.processOrder();  // 处理中 -> 已发货
        orderContext.processOrder();  // 已发货 -> 已交付
        orderContext.processOrder();
    }
}

