SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python310-azure-synapse-artifacts-0.15.0-1.3.noarch.rpm"
RPM_HASH = "c1ca4a9761f592211c778c7bbaa1c7088e90e925aa57f3cf0b9793da8097a06816bbe9079119d4c1fbe7690ffb73519eea67d24aa12498beeae6ec469bbf9709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse python3-azure-synapse-artifacts python3.10dist(azure-synapse-artifacts) python310-azure-synapse python310-azure-synapse-artifacts python3dist(azure-synapse-artifacts)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-core python310-azure-nspkg python310-azure-synapse-nspkg python310-msrest"

inherit rpm
