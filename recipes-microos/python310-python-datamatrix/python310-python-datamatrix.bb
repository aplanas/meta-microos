SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-python-datamatrix-1.0.2-1.1.noarch.rpm"
RPM_HASH = "eb4471da8e62e831f3ff3b5ea4e4d0eeaf2b54c4cb0f059c4a9c8cc40ae6d42cc2f0c0cabd5cbf4c0cfd7d96476a34923b08a339e8251300b813ff6a9a4b01ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-datamatrix python3.10dist(datamatrix) python310-python-datamatrix python3dist(datamatrix)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
