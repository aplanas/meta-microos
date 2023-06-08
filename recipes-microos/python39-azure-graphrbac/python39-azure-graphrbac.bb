SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python39-azure-graphrbac-0.61.1-2.11.noarch.rpm"
RPM_HASH = "11791bc01ccb0bbdeb3aa9da03d2ead41549ebbf43699ee1d88a9304a060b85115af7118d60dc21cef08f3916816c2fd7fa6811eabf305481f4a3c82076625e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-graphrbac) python39-azure-graphrbac python3dist(azure-graphrbac)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-nspkg python39-msrest python39-msrestazure"

inherit rpm
