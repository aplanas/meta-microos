SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python39-azure-identity-1.12.0-1.3.noarch.rpm"
RPM_HASH = "5e713e2cdb5313fea45e4d6ed3b7fc361141b936dc0e75cd6f624cb305ff2eb2362fe18729a291df4e31d465cafc4dfa530657d75913075c1c6e4e696c7f6a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-identity) python39-azure-identity python3dist(azure-identity)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-cryptography python39-msal python39-msal-extensions python39-six"

inherit rpm
