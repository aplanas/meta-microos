SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-azure-communication-identity-1.3.1-1.3.noarch.rpm"
RPM_HASH = "5b50f1066e78a6485b521cb9414c4b2fbb69a3973c060fd84823041ee3ad0e6862dfb86e47c07caf88fb73927bf7e43b3ce8af6b20cad7797e8a34b86c3e54c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-identity python3.10dist(azure-communication-identity) python310-azure-communication-identity python3dist(azure-communication-identity)"
RDEPENDS:${PN} += "python(abi) python310-azure-communication-nspkg python310-azure-core python310-azure-nspkg python310-msrest python310-six"

inherit rpm
