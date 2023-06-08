SUMMARY = "GObject wrapper for libical library"
DESCRIPTION = "This package provides a GObject wrapper for libical library with support \
for GObject Introspection."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib3-3.0.16-1.3.aarch64.rpm"
RPM_HASH = "50e199457d22ce760398552f239a4f3ec88bb378fda1b98262643543b2e798e8f9d0fe124ec11ea682055fa5d10cada56c04c505f61a2d6ebbff75f02430669a"

RPROVIDES:${PN} += "libical-glib libical-glib.so.3()(64bit) libical-glib3 libical-glib3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libical.so.3()(64bit)"

inherit rpm
