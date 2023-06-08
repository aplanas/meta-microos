SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python311-azure-identity-1.12.0-1.3.noarch.rpm"
RPM_HASH = "361cb352c2662d4df7b7890b171a090ac01e4cf3b796fdcda03e0d9ea4bfe1928472c2c5a7293beb199fe61e23b72749eb7c22bfb539cd8c3a53f5e66a1d5191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-identity) python311-azure-identity python3dist(azure-identity)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-cryptography python311-msal python311-msal-extensions python311-six"

inherit rpm
