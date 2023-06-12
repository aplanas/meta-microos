SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-azure-synapse-managedprivateendpoints-0.4.0-1.8.noarch.rpm"
RPM_HASH = "741546f86c9c477bf370d9ed49e82f41d21974745d0d0fac7c0269b3f36bd1b664322850168a84155573dd0a3491c4c256e60f24a7f6d0d30d3d539f8b92d6d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-managedprivateendpoints) \
python39-azure-synapse \
python39-azure-synapse-managedprivateendpoints \
python3dist(azure-synapse-managedprivateendpoints)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
