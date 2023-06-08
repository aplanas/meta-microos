SUMMARY = "Tools for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains tools related to metacity, including an \
utility to test themes and a small application to test window \
managers."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-tools-3.46.1-1.1.aarch64.rpm"
RPM_HASH = "5914674921d145bd80c0c975b3264bf509e69e9f8710ba9a52a9e447b96d98b9dfc74624764c95556579f34cfd1b505ecfcdc96b2061e08470a0cd0589aa1220"

RPROVIDES:${PN} += "metacity-tools metacity-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libmetacity.so.3()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libz.so.1()(64bit) metacity"

inherit rpm
