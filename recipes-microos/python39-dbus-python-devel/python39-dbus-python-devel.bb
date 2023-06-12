SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python39-dbus-python-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "b0109edd38b3fafdcf9361aee5abb8c0ed6652acbac55134a8c26d65271c228e07e6a0b67e6a7de6ce762c2819ffb7125d863081ee9565149291a33ddd8c7341"

RPROVIDES:${PN} += "dbus-1-python39-devel \
pkgconfig(dbus-python-3.9) \
python39-dbus-python-devel \
python39-dbus-python-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig(dbus-1) \
python39-dbus-python \
python39-dbus-python-common-devel \
python39-devel"

inherit rpm
