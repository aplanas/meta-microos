SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python39-dasbus-1.7-1.3.noarch.rpm"
RPM_HASH = "137189a831152216c9439d9ce009adf436ca6e30b886a7a54eb3050a15b04ed49279ab166ec1c9885ece538b5660ece08d0e04e11c9f687b53ef257c990395d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dasbus) \
python39-dasbus \
python3dist(dasbus)"
RDEPENDS:${PN} += "python(abi) \
python39-gobject \
typelib(GLib) \
typelib(Gio)"

inherit rpm
