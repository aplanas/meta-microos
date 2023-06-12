SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-regionmove-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "145fe8449d8e5bfb0fb07bc6a1fc8ebc84ab2c7a4fd13db2fb4eb133f33925bd10368e6a96ce9f8d7a91ab5ac51f0064da2fd9905f5e72c9460d672f399c167d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-regionmove \
python3.10dist(azure-mgmt-regionmove) \
python310-azure-mgmt-regionmove \
python3dist(azure-mgmt-regionmove)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
