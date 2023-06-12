SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python311-azure-servicebus-7.10.0-1.1.noarch.rpm"
RPM_HASH = "ff0b7095aa0f7f555dff2e1e890a48bc5e643ab8befac2e7f49a2151d0da3e3d00298a1d63213b668219e612710a7c002af541aa909f9d9bf94cf4b1b3696170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-servicebus) python311-azure-servicebus python3dist(azure-servicebus)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-isodate python311-typing_extensions"

inherit rpm
