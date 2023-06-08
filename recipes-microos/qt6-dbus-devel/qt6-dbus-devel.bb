SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-dbus-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "405ec902a07017165c45ba441882ba20ce1e5d6dfdbe7816e655f35545af76439ee2c2a7b417ac34f987173c7072004b8f6a88e25cb46b361e1ce42fc807e430"

RPROVIDES:${PN} += "cmake(Qt6DBus) cmake(Qt6DBusTools) pkgconfig(Qt6DBus) qt6-dbus-devel qt6-dbus-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6DBus6 pkgconfig(Qt6Core)"

inherit rpm
