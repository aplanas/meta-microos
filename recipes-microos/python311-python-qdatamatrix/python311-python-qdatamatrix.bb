SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python311-python-qdatamatrix-0.1.31-1.7.noarch.rpm"
RPM_HASH = "db86428465f089775359557c86563d9a4e76ee2c62e1d8d35b1a7087d3ea5d078d5c17bb4d83571d07766cd8fa8d9fdf57658dd4318c95fe4c370facfc84793f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-qdatamatrix) \
python311-python-qdatamatrix \
python3dist(python-qdatamatrix)"
RDEPENDS:${PN} += "python(abi) \
python311-QtPy \
python311-python-datamatrix"

inherit rpm
