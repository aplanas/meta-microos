SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-logz-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "28df5007152b98a94fcff6fe59100b6b7c0f6d5873e72f7adedf0e0762109a29820a9bcb850c9344486c8e70a16985d6f737762793cc76f4c2a2603e65f071ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-logz) \
python311-azure-mgmt-logz \
python3dist(azure-mgmt-logz)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
