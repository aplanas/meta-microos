SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python39-azure-mgmt-support-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "8c5cd42e9a8b33365a8a00028eba98cf3ae5b40d41f5b982ea128552629331be00ddc2b1407cc231d2e4e918f8c6bf2f14f59aac675f41281df01886390fe913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-support) \
python39-azure-mgmt-support \
python3dist(azure-mgmt-support)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
