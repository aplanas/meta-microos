SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python311-azure-synapse-artifacts-0.15.0-1.3.noarch.rpm"
RPM_HASH = "727724e43d011e9c297ac294b3d374e3657e4de2766535747a78f2f8bb02ccd42b13743263785d3bbfb3bcacb47ca8aeab731e99c4b77c5e5f9bcd5fd17a6172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-synapse-artifacts) python311-azure-synapse python311-azure-synapse-artifacts python3dist(azure-synapse-artifacts)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-nspkg python311-azure-synapse-nspkg python311-msrest"

inherit rpm
