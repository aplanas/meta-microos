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

RPM_NAME = "python39-paho-mqtt-1.6.1-2.10.noarch.rpm"
RPM_HASH = "936daacdc12a8f82aaeb6d4e7f36e7d113036b2b7637d78e0238af397656a70fa1cc19b6cc0e96c46073a7f9156df6b990b096779699506e4d8e3dadaad5faff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paho-mqtt) python39-paho-mqtt python3dist(paho-mqtt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
