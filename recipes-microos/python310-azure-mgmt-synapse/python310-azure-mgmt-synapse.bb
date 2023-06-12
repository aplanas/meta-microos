SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python310-azure-mgmt-synapse-2.1.0b5-1.3.noarch.rpm"
RPM_HASH = "96238b8ed8d499dea3d079d5f08d70855f647e418efdce07b27a58b7e74c5dee8b271ded98e726a4fead4464b60133f141321ac1a5145b4db97952045ed78226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-synapse \
python3.10dist(azure-mgmt-synapse) \
python310-azure-mgmt-synapse \
python3dist(azure-mgmt-synapse)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
