SUMMARY = "Development files for libdbusmenu-glib"
DESCRIPTION = "This package contains the development files for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-devel-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "f89970edf4cbeb889f7cef729ce5a8c97002c822d19c4e3c352e11c27add840367f7b60fc395c3a720dfdc6c6a0f8956ae4828dc45491b6c85d4b68717063bf6"

RPROVIDES:${PN} += "libdbusmenu-glib-devel \
libdbusmenu-glib-devel(aarch-64) \
pkgconfig(dbusmenu-glib-0.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-glib4 \
pkgconfig(dbus-glib-1) \
typelib-1_0-Dbusmenu-0_4"

inherit rpm
