SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-customproviders-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "85eaae71140816e9d5d0c37bfa3e1867f5fd4c25baaa1823a169ac9c3a42c7e921994bd27cd174bd601d32053cf749220ccb037ebea29dff84b14f799a92b2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-customproviders python3.10dist(azure-mgmt-customproviders) python310-azure-mgmt-customproviders python3dist(azure-mgmt-customproviders)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
