### Task 4 (W). ###

General pseudo code:

```
initialize() {
    newARREvent();
    }

while (clock < simulationTime) {
    setATime() {
        setClock(nextEventTime);
        }
    
    runBEvents() {
        while (getClock == nextEventTime) {
            runEvent(nextEvent);
            }
        }
    
    tryCEvent() {
        for (servicePoint : servicePoints) {
            if (!servicePoint.isReserved() && servicePoint.queueSize() > 0) {
                servicePoint.serve();
                }
            }
        }
        
getResults(); 
```     