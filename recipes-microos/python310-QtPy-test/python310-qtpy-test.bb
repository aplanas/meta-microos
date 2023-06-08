SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-QtPy-test-2.3.0-1.4.noarch.rpm"
RPM_HASH = "9646401fed3506af59de83018e141fe0f955b1d74376e45d2d9445e7a46baa3be215c20c28dc050fbb1e7352a17c36bf762c8cc727a94633578aea9a4e04b1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy-test python310-QtPy-test"
RDEPENDS:${PN} += "python(abi) python310-QtPy"

inherit rpm
