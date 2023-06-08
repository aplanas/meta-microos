SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "29.1.0"

RPM_NAME = "python39-azure-mgmt-compute-29.1.0-1.3.noarch.rpm"
RPM_HASH = "16d6d6ccbb66720d8aa7e467065962acc444148d12b7b7ecebc25ce141929d143cec963f2f02a23e626f493fd61d994e7c46e652929fa4d059727828b1e059e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-compute) python39-azure-mgmt-compute python3dist(azure-mgmt-compute)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
