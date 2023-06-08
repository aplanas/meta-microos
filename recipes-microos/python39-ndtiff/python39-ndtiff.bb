SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python39-ndtiff-1.12.0-1.1.noarch.rpm"
RPM_HASH = "0be68cea86b0036f5aec41feeb912601ad7af5d93391832399f465e8c705510425b7a493bdd71f95cc9b559c2cdec13eb1104d41074b84b9c9a687e4b55b0b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ndtiff) python39-ndtiff python3dist(ndtiff)"
RDEPENDS:${PN} += "python(abi) python39-dask-array python39-numpy"

inherit rpm
