SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-guestconfig-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "589e13c02f17cd0fcb4f483e381d10e4d9282e9eee3e1df28e7cf7635683c1791bd1ae32795a0c562dedf57c57cbf2cd00b0ab08c8af759a5a757489af3bffed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-guestconfig python3.10dist(azure-mgmt-guestconfig) python310-azure-mgmt-guestconfig python3dist(azure-mgmt-guestconfig)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
