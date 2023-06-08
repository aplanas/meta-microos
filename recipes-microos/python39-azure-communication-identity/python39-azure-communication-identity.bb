SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-azure-communication-identity-1.3.1-1.3.noarch.rpm"
RPM_HASH = "891287255f55bc8094b20bcf1f36a233cf2cc1fe6e03e60f560cd6454e63a91a090c9332cc13f7e83bd0872e70fafb671562c93744359217105caac5c7cf124f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-identity) python39-azure-communication-identity python3dist(azure-communication-identity)"
RDEPENDS:${PN} += "python(abi) python39-azure-communication-nspkg python39-azure-core python39-azure-nspkg python39-msrest python39-six"

inherit rpm
