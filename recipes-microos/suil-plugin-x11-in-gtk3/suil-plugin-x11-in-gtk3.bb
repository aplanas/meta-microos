SUMMARY = "Shared object for GTK3 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK3 hosts displaying X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-in-gtk3-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "1a816a469e076a1ebc910251f9936dc07ad992e5c4ace77c56880393ab8ad3e8155c0679e9cdd812188812355994d0060a15bcb91b8c314c3d2772e0552f69c5"

RPROVIDES:${PN} += "libsuil_x11_in_gtk3.so()(64bit) suil-plugin-x11-in-gtk3 suil-plugin-x11-in-gtk3(aarch-64)"
RDEPENDS:${PN} += "gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libsuil-0-0"

inherit rpm
