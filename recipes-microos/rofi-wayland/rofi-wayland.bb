SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "This is a fork of rofi with added support for Wayland via the layer shell protocol."
LICENSE = "MIT"

PV = "1.7.5+wayland1"

RPM_NAME = "rofi-wayland-1.7.5+wayland1-1.3.aarch64.rpm"
RPM_HASH = "6e20914066afebc920b00cc0fda9a674e99fd7ebc9d64c81f100b8acd02c76514b4c49536085e58b7b058bc1cf421e5ab6ad9edbb7cf4cf82034f65929902089"

RPROVIDES:${PN} += "application() application(rofi-theme-selector.desktop) application(rofi.desktop) rofi-launcher rofi-wayland rofi-wayland(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbcommon.so.0(V_0.7.0)(64bit)"

inherit rpm
