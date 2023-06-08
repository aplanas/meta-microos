SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.9.0"

RPM_NAME = "python39-azure-servicebus-7.9.0-1.1.noarch.rpm"
RPM_HASH = "1c2b3e66d552fbd06f41fc6109afc4c4e24af6e194174153ba12de40aefc97d4e4915ec071fb3a31bb8c9c81b37bc25af528d0dfbc878351e2864e8b648a0e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-servicebus) python39-azure-servicebus python3dist(azure-servicebus)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-core python39-azure-nspkg python39-isodate python39-uamqp"

inherit rpm
