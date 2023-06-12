SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-dashboard-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "e9929eab318ca6debd06002db177e28c684f4f4a0d91930e3d411a22c7f50b075703e580b9ae2e73f40690388bd1449e54878bb27e93df7123f857fefb4f0022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-dashboard) \
python39-azure-mgmt-dashboard \
python3dist(azure-mgmt-dashboard)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
