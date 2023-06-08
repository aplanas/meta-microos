SUMMARY = "MQTT version 3.11 client class"
DESCRIPTION = "This code provides a client class which enable applications to connect to an \
MQTT broker to publish messages, and to subscribe to topics and receive \
published messages. It also provides some helper functions to make publishing \
one off messages to an MQTT server very straightforward. \
 \
The MQTT protocol is a machine-to-machine (M2M)/'Internet of Things' \
connectivity protocol. Designed as an extremely lightweight publish/subscribe \
messaging transport, it is useful for connections with remote locations where \
a small code footprint is required and/or network bandwidth is at a premium. \
 \
Paho is an Eclipse Foundation project."
LICENSE = "EPL-1.0"

PV = "1.6.1"

RPM_NAME = "python310-paho-mqtt-1.6.1-2.10.noarch.rpm"
RPM_HASH = "a2888164fe7c8eda0744028461c1ba0d860195ae5328c0a69abeecaeca743c9d939c8705d0188fac3ff878576a124d2d00446f88110d0d5d1c5502e6c6461a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paho-mqtt python3.10dist(paho-mqtt) python310-paho-mqtt python3dist(paho-mqtt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
