SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-portal-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "0931440c161aa70b6289b7e13334451da83164366af7bc5dceefd810332072942572fdf40451615225515430d8c82f38e4e1314fc9d6cce6a6585930d4f8ae4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-portal) python39-azure-mgmt-portal python3dist(azure-mgmt-portal)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
