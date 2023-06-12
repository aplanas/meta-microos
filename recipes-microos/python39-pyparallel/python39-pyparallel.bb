SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-pyparallel-0.2.2-3.17.noarch.rpm"
RPM_HASH = "5acefd5f2cbb8bd99423bb55a8b41aba5321591c80374af735dfc38bd47c1e25cfb72d4db8af51c00d765fc37454511d2b0abd7b07ae65b4d9d8e0377556ad11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyparallel) \
python39-pyparallel \
python3dist(pyparallel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
