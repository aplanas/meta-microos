SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python39-pyfakefs-5.0.0-2.1.noarch.rpm"
RPM_HASH = "dc0b7653e1d517e3528e9269e39e1f13ebfb16469061bea58928d3a6eb23f1317a89a9728b16922a62e33d2c409c88a3bdd1c0eb1b29db71250f77de04ff73c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyfakefs) python39-pyfakefs python3dist(pyfakefs)"
RDEPENDS:${PN} += "python(abi) python39"

inherit rpm
