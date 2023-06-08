SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-synapse-monitoring-0.2.0-1.10.noarch.rpm"
RPM_HASH = "99dd7092683d3b7a48f37b5dd00db6e66932887c00e707dbb1cc677b9a725db84864fc2661c6b2a8b4224665055dad6ab22ca4f5876361437d5e611ed8dbcdc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-monitoring) python39-azure-synapse python39-azure-synapse-monitoring python3dist(azure-synapse-monitoring)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-core python39-azure-nspkg python39-azure-synapse-nspkg python39-msrest"

inherit rpm
