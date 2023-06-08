SUMMARY = "N-D labeled arrays and datasets in Python"
DESCRIPTION = "xarray (formerly xray) is a python-pandas-like and pandas-compatible \
toolkit for analytics on multi-dimensional arrays. It provides \
N-dimensional variants of the python-pandas labeled data structures, \
rather than the tabular data that pandas uses. \
 \
The Common Data Model for self-describing scientific data is used. \
The dataset is an in-memory representation of a netCDF file."
LICENSE = "Apache-2.0"

PV = "2023.2.0"

RPM_NAME = "python310-xarray-2023.2.0-1.1.noarch.rpm"
RPM_HASH = "3000e280027ee64d1d4e5f000d5ade541c878d205139e18b08510ec9c9a89fc99383bfe6daa87ad4b312383bd9b3ebf296f18b3621fbad20e3d2fa9f59203360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray python3-xray python3.10dist(xarray) python310-xarray python310-xray python3dist(xarray)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-packaging python310-pandas"

inherit rpm
