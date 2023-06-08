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

RPM_NAME = "python39-xarray-2023.2.0-1.1.noarch.rpm"
RPM_HASH = "4d82e67963fe61b2bb13adea3c93a998951ae2b7f7433305421fb547f1e33b155f2b58007b4936c5360d407eed524b53a1fce3dda30b2961a104faba83ca6913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xarray) python39-xarray python39-xray python3dist(xarray)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-packaging python39-pandas"

inherit rpm
