SUMMARY = "Introspection bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package provides the GObject Introspection bindings for the \
libatspi library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "typelib-1_0-Atspi-2_0-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "af3a4e92fbcce9165b8c63a12c8bc16c3f5a6980f75922333c276497aca6c7bc7bd24692f2b02e4ef0b4d0d63954d5cb994106a1ebb0e63b0bb92f086faa0572"

RPROVIDES:${PN} += "typelib(Atspi) typelib-1_0-Atspi-2_0 typelib-1_0-Atspi-2_0(aarch-64)"
RDEPENDS:${PN} += "libatspi.so.0()(64bit) typelib(DBus) typelib(GLib) typelib(GObject)"

inherit rpm
