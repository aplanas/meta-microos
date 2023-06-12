SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-logz-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "dcf376d70f66813ab8abb7002149ff473c8fa12a71ead4cf97be185d0788d43df374bb7d4e7f4829c55c45681e66e4b19029be4c53ff408e03e136dda62f4fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-logz) \
python39-azure-mgmt-logz \
python3dist(azure-mgmt-logz)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
