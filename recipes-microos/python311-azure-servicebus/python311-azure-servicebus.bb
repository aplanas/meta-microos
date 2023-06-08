SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.9.0"

RPM_NAME = "python311-azure-servicebus-7.9.0-1.1.noarch.rpm"
RPM_HASH = "ea1d6ea484e972065dc68e0fe357c9e680cd5a5a0da34ed2fed75bbd900bf270b5e2e6851bb4303feeb6a945c26968faeec79f1afec31346eaaafcd884d330c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-servicebus) python311-azure-servicebus python3dist(azure-servicebus)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-nspkg python311-isodate python311-uamqp"

inherit rpm
