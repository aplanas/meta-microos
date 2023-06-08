SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python310-pyfakefs-5.0.0-2.1.noarch.rpm"
RPM_HASH = "02699aedb1c19fdf6863fbb3da692886c96d468a81b7e542cd2e36d897d9ef0b5e168580056c049e67ea91673dc52ce6ada1c57576671c3c758678ee3084dc8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfakefs python3.10dist(pyfakefs) python310-pyfakefs python3dist(pyfakefs)"
RDEPENDS:${PN} += "python(abi) python310"

inherit rpm
