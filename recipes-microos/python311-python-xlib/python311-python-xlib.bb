SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python311-python-xlib-0.33-1.1.noarch.rpm"
RPM_HASH = "6fe87a3c3c3e253a27a3f8dc447fcbccd7c221ce1a6144784b52546168b1e1ac76265064cb2ab84d48041f13cc59b34a27ad71ea153528e13d517c64be2c013b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-xlib) \
python311-python-xlib \
python311-xlib \
python3dist(python-xlib)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
