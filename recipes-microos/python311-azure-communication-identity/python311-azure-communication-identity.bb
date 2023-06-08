SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-azure-communication-identity-1.3.1-1.3.noarch.rpm"
RPM_HASH = "f21c09d58316ebecbb7e71566dfbcbc492cd21db9bd2d0b7f1316da260a5b5aa7df81b4936fb7a623b81f48d7d12826b81d27c7171a5c682c75f846ed1fa4ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-identity) python311-azure-communication-identity python3dist(azure-communication-identity)"
RDEPENDS:${PN} += "python(abi) python311-azure-communication-nspkg python311-azure-core python311-azure-nspkg python311-msrest python311-six"

inherit rpm
