SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python310-azure-identity-1.12.0-1.3.noarch.rpm"
RPM_HASH = "a15b5b1d21e1a38519031bd07f1fd2734d4fe80149c6960b05b76fe37efe751ee54e5571a3b117d4b29f1bf00974ce7ba1285f33da1c6771d84c5995f965a704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-identity python3.10dist(azure-identity) python310-azure-identity python3dist(azure-identity)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-cryptography python310-msal python310-msal-extensions python310-six"

inherit rpm
