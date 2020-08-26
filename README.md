# chatbot-network

In this project we have a pool of Robots and a pool of People. Each person have different behaviour (AGGRESSIVE / PATIENT) and the implemented system analyzes the pool of robots and assigns a robot to the person based on the robot's behaviour and availability.  

# Output

```
Person Pool
{ name: P1 age: 21 personality: AGGRESSIVE isTalking: false robotOwned: R3
{ name: P2 age: 24 personality: AGGRESSIVE isTalking: false robotOwned: R5
{ name: P3 age: 27 personality: PATIENT isTalking: false robotOwned: R1
{ name: P4 age: 24 personality: AGGRESSIVE isTalking: false robotOwned: R7

Robot Pool
{ name: R1 personality: PATIENT isBusy: true lookingAt: []
{ name: R2 personality: PATIENT isBusy: false lookingAt: []
{ name: R3 personality: AGGRESSIVE isBusy: true lookingAt: []
{ name: R4 personality: PATIENT isBusy: false lookingAt: []
{ name: R5 personality: AGGRESSIVE isBusy: true lookingAt: []
{ name: R6 personality: PATIENT isBusy: false lookingAt: []
{ name: R7 personality: AGGRESSIVE isBusy: true lookingAt: []

------------------------------

Robot Pool
{ name: R1 personality: PATIENT isBusy: true lookingAt: [R2, R3, R7]
{ name: R2 personality: PATIENT isBusy: false lookingAt: [R6]
{ name: R3 personality: AGGRESSIVE isBusy: true lookingAt: []
{ name: R4 personality: PATIENT isBusy: false lookingAt: [R2, R5, R7]
{ name: R5 personality: AGGRESSIVE isBusy: true lookingAt: [R7]
{ name: R6 personality: PATIENT isBusy: false lookingAt: []
{ name: R7 personality: AGGRESSIVE isBusy: true lookingAt: [R6]
```
