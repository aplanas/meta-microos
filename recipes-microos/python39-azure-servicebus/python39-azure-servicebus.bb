SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python39-azure-servicebus-7.10.0-1.1.noarch.rpm"
RPM_HASH = "63a519da9d222279e076d4434ca4855fa3fc8db48d9506afac28b7f388253247bbec6943738cf8cbb183686def51203b30b203895a389014ab88fe408c8f8370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-servicebus) \
python39-azure-servicebus \
python3dist(azure-servicebus)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-isodate \
python39-typing_extensions"

inherit rpm
