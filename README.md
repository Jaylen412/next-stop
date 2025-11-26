# NextStop Detroit

![b0796152-5675-4341-8916-bbc85890311b-IMG-2713.webp](/readme-files/b0796152-5675-4341-8916-bbc85890311b-IMG-2713.webp)

## Project Overview

Integrate traffic flow data, weather conditions and bus position to deliver a tool that allows riders to get an estimate on what time the bus will arrive with a kiosk style display at bus stops. Integration with Watsonx.AI to summarize traffic volume, delays and weather condition effects on route.

## Objective

**_We’re not just showing a new ETA. We’re providing disruption forecasting_**

Train the model to predict the probability of a delay exceeding 10 minutes (a critical threshold for riders), and use a Generative AI to frame the output as a rider alert (e.g., "Due to heavy rain and congestion on Woodward, Route 4 is expected to be 18 minutes late. Alternative: Walk to the QLine stop 5 minutes away").

## Resources:

**Detroit Open Data Portal**

- [GTFS Bus Data](https://data.detroitmi.gov/documents/1de3fec8cc894fdbbc03c5d31bca32d4/about) - DDOT schedule and stop data.
- [DDOT Bus Routes](https://data.detroitmi.gov/datasets/detroitmi::ddot-bus-routes/about) - Public transit routes for DDOT
- [Bus Schedules](https://detroitmi.gov/departments/detroit-department-transportation/bus-schedules) - City of Detroit information on routes & schedules
- [Traffic Volumes](https://data.detroitmi.gov/maps/049ffe8e321b4a70a2b09dd66b9e0255/about) - Detroit traffic congestion data

**API’s & Documentation**

- [Bus Tracker](https://www.myddotbus.com/home) - DDOT service offering trip planning, live view of bus and estimations on arrival.
- [Tomorrow.io](https://docs.tomorrow.io/reference/realtime-weather) - Weather Data
- [tomtom](https://developer.tomtom.com/) - Traffic Data
- [DDOT API Docs](https://www.myddotbus.com/api-doc) - Official API documentation
