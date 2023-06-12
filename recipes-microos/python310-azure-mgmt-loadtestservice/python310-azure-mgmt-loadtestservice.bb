SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-loadtestservice-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "cf7809ff3e56cb3b57917eb1b1314550e5cd775c01156fe43f1ac02687db13ac1fd119d22b345d6f5346eeef5287ef99db6a141e52b7681201998b1b1d86bc95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtestservice \
python3.10dist(azure-mgmt-loadtestservice) \
python310-azure-mgmt-loadtestservice \
python3dist(azure-mgmt-loadtestservice)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
