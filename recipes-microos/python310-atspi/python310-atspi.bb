SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python310-atspi-2.46.0-1.3.noarch.rpm"
RPM_HASH = "06358809e78e0d10a766a8dc057b2d252aec2d5d9111fc2b50486ff20df8c032faea11e83a100959ece426735b1a56603db3dc0578d328f9b31a589d8c86923f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3atspi python3-atspi python310-atspi"
RDEPENDS:${PN} += "python(abi) python310-dbus-python python310-gobject typelib(Atspi) typelib(GLib) typelib(GObject)"

inherit rpm
