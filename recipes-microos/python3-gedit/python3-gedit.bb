SUMMARY = "Python bindings for gedit"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME \
environment. \
 \
This package provides the python bindings, based on gobject-introspection."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "python3-gedit-44.2-1.4.noarch.rpm"
RPM_HASH = "653803982c231581636983019b295402363fc154b9fdaad696e1cb4c38f89996593c3e9adc5801407c1f3fa0ae20478aed7fbf8afae97f085eb82cba8a02e3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gedit"
RDEPENDS:${PN} += "python(abi) typelib(GObject)"

inherit rpm
