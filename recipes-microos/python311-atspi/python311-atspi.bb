SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python311-atspi-2.46.0-1.3.noarch.rpm"
RPM_HASH = "cd9e00c539d125af73849812ddcbef88ae46f57af645eb27a4fa82225134de3473d3d39f63e091b9d30b849b0ec83e5cce2e656b1877cb5c3929cde41c2083b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-atspi"
RDEPENDS:${PN} += "python(abi) python311-dbus-python python311-gobject typelib(Atspi) typelib(GLib) typelib(GObject)"

inherit rpm
