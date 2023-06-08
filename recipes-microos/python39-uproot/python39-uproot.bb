SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.7"

RPM_NAME = "python39-uproot-5.0.7-1.1.noarch.rpm"
RPM_HASH = "65e94cbbed5442152cb11b423f181defe0cdd26575bf5afcb339dc83394d38b16ffba798202b4b589db3943ddbda74cd2c29c9e6209d890ded88002ae4348856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uproot) python39-uproot python3dist(uproot)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-packaging"

inherit rpm
