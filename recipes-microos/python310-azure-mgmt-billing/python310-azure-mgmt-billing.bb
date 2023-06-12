SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python310-azure-mgmt-billing-6.0.0.0-1.3.noarch.rpm"
RPM_HASH = "0e054f1cf84432c1d14be5f7447e8a01701429fe0c8bfd8a4bb811e6d606b2553bbdbf23d4fbce72b491bc8db23bc0180683ab0177ad070ab411a7cc87f024be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-billing \
python3.10dist(azure-mgmt-billing) \
python310-azure-mgmt-billing \
python3dist(azure-mgmt-billing)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
