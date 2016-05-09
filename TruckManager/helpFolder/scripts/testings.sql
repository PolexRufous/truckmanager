SELECT trucks.model, drivers.firstname, contragents.shortname, orders.placefrom, orders.placeto, orders.cargo from orders
JOIN trucks ON orders.truck_id = trucks.id
JOIN drivers ON orders.driver_id = drivers.id
JOIN contragents ON orders.customer_id = contragents.id
WHERE manager_id = 1;
