SUMMARY = "SPICE Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the SPICE protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-spice-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "dc4bb9cfe9316332622f53edf9ddfe7595352bf4be6916b3b0cf2d3111c986192d113c2af69d70750bfe5b8cef1aef748195e13f06abc7f2ff1fec17fd9c6707"

RPROVIDES:${PN} += "remmina-plugin-spice \
remmina-plugin-spice(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-gtk-3.0.so.5()(64bit) \
libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) \
remmina"

inherit rpm
