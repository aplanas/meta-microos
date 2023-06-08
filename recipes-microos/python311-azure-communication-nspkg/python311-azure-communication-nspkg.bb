SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python311-azure-communication-nspkg-0.0.0b1-2.11.noarch.rpm"
RPM_HASH = "4b15914a01bb07f3191f62b6615d7b184e602d7487412f2ea163eaa50a7e7744e0ec83e03da1f3d7e0b86b37b5d0553149a8f1bb1f929b86ff6b4ac4000f733e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-nspkg) python311-azure-communication-nspkg python3dist(azure-communication-nspkg)"
RDEPENDS:${PN} += "python(abi) python311-azure-nspkg"

inherit rpm
