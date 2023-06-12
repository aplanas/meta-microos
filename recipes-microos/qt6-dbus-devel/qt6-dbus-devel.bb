SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "24e2397a4a2387c71b955d81dc9188e9df04a57a089d4fc8198e93a1fb8658aa373161358a28c76b36cc97be91179a9974a7b81de1f229a56c92fc75f34af62f"

RPROVIDES:${PN} += "cmake(Qt6DBus) cmake(Qt6DBusTools) pkgconfig(Qt6DBus) qt6-dbus-devel qt6-dbus-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6DBus6 pkgconfig(Qt6Core)"

inherit rpm
