SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-messaging-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "1087f1b2b5d09a974d05c89cecca4b7ffb507e37d00e470554bad6960100acc8e7ddfeba5b4d7a0b0017b698ced09b3e403590b3d755d558a2b50518b029b8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-nspkg python3.10dist(azure-messaging-nspkg) python310-azure-messaging-nspkg python3dist(azure-messaging-nspkg)"
RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
