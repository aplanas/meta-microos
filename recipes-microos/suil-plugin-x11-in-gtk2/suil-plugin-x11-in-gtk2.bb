SUMMARY = "Shared object for GTK2 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK2 hosts displaying X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-in-gtk2-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "4924d2a26e7052ee01875cb5eeac5ec3c76fc005241e5f27144d0b41b8cebddcc6b233a7a9fb1593bd76d1c55bd2da4e1a076a48cc52fac8e79667969b6d8aea"

RPROVIDES:${PN} += "libsuil-x11-in-gtk2 \
libsuil_x11_in_gtk2.so()(64bit) \
suil-plugin-x11-in-gtk2 \
suil-plugin-x11-in-gtk2(aarch-64)"
RDEPENDS:${PN} += "gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libsuil-0-0"

inherit rpm
