Spring Boot Kafka Example

This sample application shows how to use basic Spring Boot configuration to set up a producer to a topic with multiple partitions and a consumer group with three different consumers.


Multiple serialization / deserialization formats

To illustrate the different configuration options, this application deserializes Kafka messages in three different ways:

As a JSON to Java object.
As a simple String (plain JSON).
As a byte array.


Docker compose

This code includes a docker-compose.yml file, so you can use Docker Compose to start up Kafka without installing anything.
