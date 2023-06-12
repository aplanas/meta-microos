SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python311-azure-synapse-artifacts-0.16.0-1.1.noarch.rpm"
RPM_HASH = "c1ed2a636bf38f13f63465e3cbaab24f7518d279c2990856a9afca907eb5390988740efd0246db82bf9fbe98b6a0adf3dac3a43770c5a17cca5aee588a894726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-synapse-artifacts) \
python311-azure-synapse \
python311-azure-synapse-artifacts \
python3dist(azure-synapse-artifacts)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-core \
python311-azure-nspkg \
python311-azure-synapse-nspkg \
python311-msrest"

inherit rpm
