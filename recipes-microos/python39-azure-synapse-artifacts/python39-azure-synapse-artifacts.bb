SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python39-azure-synapse-artifacts-0.15.0-1.3.noarch.rpm"
RPM_HASH = "709da6c808928c8522b668015e7e6b11e89e3f2b7300b6978682c965fee82b45f1e1db7f2da6b4f61b3a3713a30b1ab4e3c39b1943d85ce46e1cba1b7555767d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-artifacts) python39-azure-synapse python39-azure-synapse-artifacts python3dist(azure-synapse-artifacts)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-core python39-azure-nspkg python39-azure-synapse-nspkg python39-msrest"

inherit rpm
