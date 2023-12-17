### Task 1 (W). ###

Example case: checkout queues in supermarket: customers arrive at a supermarket cash line and choose to queue at a
cashier that has the least customers waiting at that cash register.

#### Directly Observable Variables: ####

* A, arrived clients count: the number of customers that have arrived at the checkout area.
* C, clients serviced count: the number of customers who have completed checking out and exited the cash register.
* B, active time in service point: cumulative time cash registers (service points) are actively serving customers.
* T, total simulation time: overall duration of the simulation.

#### Derived Variables: ####

* U (U = B/T), service point utilization related to the max capacity: ratio of the time service points are serving
  customers to the total simulation time.
* X (X = C/T), service throughput: number of customers serviced related to the time.
* S (S = B/C), service time: average service time in the service point (cashier).

#### Additional Directly Observable Variables: ####

* Ri, response time for a customer: time from a customer's arrival at the checkout to the end of service (exiting the
  cash register).
* W, waiting time: cumulative response time for all customers serviced during the entire simulation time.
* R (R= W/C), average response time: average time a customer spends in the system.
* N (N = W/T), average queue length: average length of the queue.

