SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python38-azure-messaging-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "7db9c9f715d12cfdfa4892a583a6244a0a35f3bbc1ce19b929dce09e0db4b4e328f6f115363a6a12d26c6421a9f9a76ee19003b57a79800c1283081f6fc326e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-messaging-nspkg) python38-azure-messaging-nspkg python3dist(azure-messaging-nspkg)"
RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
