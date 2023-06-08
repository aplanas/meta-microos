SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-defendereasm-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "1a6954e2a41b975d244a13cc1eaa77c561057356f94164254aa842a9cbc69f11616ab987f01dbd33fee02c1a96412bdef5ae5247efe4afecbdcfb23b40fcbb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-defendereasm) python39-azure-mgmt-defendereasm python3dist(azure-mgmt-defendereasm)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
