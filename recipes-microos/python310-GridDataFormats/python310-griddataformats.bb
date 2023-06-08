SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python310-GridDataFormats-1.0.1-1.1.noarch.rpm"
RPM_HASH = "91a8a59c57cbaa78e27aee03902c1b1a1b78dc82455f5767092bd15f712572ec0a9cebaa79cc154e0a6fbd122ed24adbe3890e1433ab76dbdca570445e38e714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GridDataFormats python3.10dist(griddataformats) python310-GridDataFormats python3dist(griddataformats)"
RDEPENDS:${PN} += "python(abi) python310-mrcfile python310-numpy python310-scipy"

inherit rpm
