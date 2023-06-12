SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-elastic-1.0.0-1.8.noarch.rpm"
RPM_HASH = "a028d8a17d53f64a531dcc996fec8e5223f5653d13725cb698817c48fb23e07c2794f9fcebebd86e3fe2fc162fd76dd8f42e6238ef68821bf04a02991a75f610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-elastic) \
python311-azure-mgmt-elastic \
python3dist(azure-mgmt-elastic)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
