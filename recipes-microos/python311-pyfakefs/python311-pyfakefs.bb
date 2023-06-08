SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python311-pyfakefs-5.0.0-2.1.noarch.rpm"
RPM_HASH = "c8065990b28896dab2857989f6a795b67939fa8e9fea15b8f77bdf1442c592bb34eb0c9769fafa2309fb0dd1b4aee739e06ccb7e8353680608c24622b7de1783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyfakefs) python311-pyfakefs python3dist(pyfakefs)"
RDEPENDS:${PN} += "python(abi) python311"

inherit rpm
