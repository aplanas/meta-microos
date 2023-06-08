SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-synapse-accesscontrol-0.7.0-1.8.noarch.rpm"
RPM_HASH = "69aaf6e220374ce64ad12399ae54fd878e2e99e8fe79e581cba88ea4c8d3272b79815c5c868b09079fb2a6575bcaa299f71abd250bef7044e83bace031e1d040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse python3-azure-synapse-accesscontrol python3.10dist(azure-synapse-accesscontrol) python310-azure-synapse python310-azure-synapse-accesscontrol python3dist(azure-synapse-accesscontrol)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-core python310-azure-nspkg python310-azure-synapse-nspkg python310-msrest"

inherit rpm
