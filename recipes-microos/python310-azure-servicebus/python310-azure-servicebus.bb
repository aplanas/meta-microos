SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.9.0"

RPM_NAME = "python310-azure-servicebus-7.9.0-1.1.noarch.rpm"
RPM_HASH = "bd6e0e4e170f7f3003ee53aca98c01e310dd4a8d9b0f54a7e3b4ab6c1cc8377d224f01699542470c0037247f9824c805f503f4ef4e74f5c243234efc55a7422f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicebus python3.10dist(azure-servicebus) python310-azure-servicebus python3dist(azure-servicebus)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-core python310-azure-nspkg python310-isodate python310-uamqp"

inherit rpm
