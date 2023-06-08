SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.7"

RPM_NAME = "python310-uproot-5.0.7-1.1.noarch.rpm"
RPM_HASH = "b07a2252871ab3776c4d87e58afbec38a5af2a03851f1fa0d46491d86e6a6cd2c2b946a3755052b90b60a1d9ab26383f0cf93bbd62f40943ea1942a15f1b658f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uproot python3.10dist(uproot) python310-uproot python3dist(uproot)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-packaging"

inherit rpm
