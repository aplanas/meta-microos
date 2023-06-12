SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-app-1.0.0b2-1.5.noarch.rpm"
RPM_HASH = "af4469db7a42a5a028ed52d58b6f3fb219733fe22585462155e80644bf3ee6ccec0749536f8e78915936f1adadab6bf7763321a24e527710fc45083934bd7500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-app) \
python311-azure-mgmt-app \
python3dist(azure-mgmt-app)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
