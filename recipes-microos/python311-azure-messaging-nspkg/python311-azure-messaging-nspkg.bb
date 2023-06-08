SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-messaging-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "5f1f5ed5dca7c6f2fccf6cfcd4765d021c4d922cd3c67dabdf25c2d4a6252d5e993320d47df5b31fd0775ac5e21dacfeebd6dc0030db908d625e7418ea841b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-messaging-nspkg) python311-azure-messaging-nspkg python3dist(azure-messaging-nspkg)"
RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
