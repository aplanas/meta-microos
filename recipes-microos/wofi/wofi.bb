SUMMARY = "Launcher for wlroots compositors"
DESCRIPTION = "Wofi is a launcher/menu program for wlroots based wayland compositors such as sway."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "wofi-1.3-1.3.aarch64.rpm"
RPM_HASH = "805d0df858f3c0175243210b570171b802a971ff4d80d6d64db25c0cfb0561b319e1b2aee41e00659fc0d328f1a954c40a850a46e78c6c5a86354a6d2fb3202e"

RPROVIDES:${PN} += "wofi wofi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
