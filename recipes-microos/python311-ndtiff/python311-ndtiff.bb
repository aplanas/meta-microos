SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python311-ndtiff-1.12.0-1.1.noarch.rpm"
RPM_HASH = "0953f2e5e1753cc4f4622706cb0e2a61f4db30228b74101b9276e3fe7acae1d6779282aba393174a86d3829858bfde3c9e37bda8d8d9878fddf8482142ec5b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ndtiff) python311-ndtiff python3dist(ndtiff)"
RDEPENDS:${PN} += "python(abi) python311-dask-array python311-numpy"

inherit rpm
