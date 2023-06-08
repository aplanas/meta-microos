SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-synapse-spark-0.7.0-1.8.noarch.rpm"
RPM_HASH = "6bd90af322b7b25b1641e7afd78c5feca5a8217b224b6d79e6cd0f837b4b9e602686476182a65056099c535f55a1a95028868f238cf8f74b6da5313c5c760548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-synapse-spark) python311-azure-synapse python311-azure-synapse-spark python3dist(azure-synapse-spark)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-core python311-azure-nspkg python311-azure-synapse-nspkg python311-msrest"

inherit rpm
