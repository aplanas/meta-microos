SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-azure-mgmt-commerce-6.0.0-1.10.noarch.rpm"
RPM_HASH = "5d37bf3811dac38ab5307b2c6839f2c313a09ae8b834fb7ba3aaaf8f1bc4dcc34eb94d4fcce6631a4f326e46e8391489c388732ebfbcd41fdc72f1901aa1bb68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-commerce) python39-azure-mgmt-commerce python3dist(azure-mgmt-commerce)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg"

inherit rpm
