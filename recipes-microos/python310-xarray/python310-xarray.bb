SUMMARY = "N-D labeled arrays and datasets in Python"
DESCRIPTION = "xarray (formerly xray) is a python-pandas-like and pandas-compatible \
toolkit for analytics on multi-dimensional arrays. It provides \
N-dimensional variants of the python-pandas labeled data structures, \
rather than the tabular data that pandas uses. \
 \
The Common Data Model for self-describing scientific data is used. \
The dataset is an in-memory representation of a netCDF file."
LICENSE = "Apache-2.0"

PV = "2023.5.0"

RPM_NAME = "python310-xarray-2023.5.0-1.1.noarch.rpm"
RPM_HASH = "0bb3771f4e775aaae1c12a226d07f144c5cc1709eed26a4055cd03b52bd89e3c46231a3ba9c07d152bbaaf8f71f4c6401d2b317e6982e317abe323a2172769b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray python3-xray python3.10dist(xarray) python310-xarray python310-xray python3dist(xarray)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-packaging python310-pandas"

inherit rpm
