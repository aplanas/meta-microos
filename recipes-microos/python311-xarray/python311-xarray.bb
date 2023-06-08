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

RPM_NAME = "python311-xarray-2023.2.0-1.1.noarch.rpm"
RPM_HASH = "22f42b7f17a4df1a550b8b5b44e93cb367311d9e69a45e8b0237f3414c00bac2d7f3dcc34edfa368c09da5b830fa3031c73cb2c0ce5c7583acf949616662c1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xarray) python311-xarray python311-xray python3dist(xarray)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-packaging python311-pandas"

inherit rpm
