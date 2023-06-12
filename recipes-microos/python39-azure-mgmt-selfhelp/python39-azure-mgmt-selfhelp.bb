SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-selfhelp-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "6be4f4657c277b7eca4706686b4f10ec8814db66bb19a9e18d48174adb0bc1a9514482846e2994b0e585bf4e6ae4bd62a536894c6090dbc50cbef4960d211ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-selfhelp) python39-azure-mgmt-selfhelp python3dist(azure-mgmt-selfhelp)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
