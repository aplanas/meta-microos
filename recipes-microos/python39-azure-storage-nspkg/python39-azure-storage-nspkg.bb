SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-storage-nspkg-3.1.0-2.11.noarch.rpm"
RPM_HASH = "ca7beef60f33eeb738287bd4e9891cbfee11bec52931dbcd7d1dda138598c68bb4eaa179751b966095f769a30177f0f213774cb50ecd965c8be42bb423889876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-nspkg) python39-azure-storage-nspkg python3dist(azure-storage-nspkg)"
RDEPENDS:${PN} += "python(abi) python39-azure-nspkg"

inherit rpm
