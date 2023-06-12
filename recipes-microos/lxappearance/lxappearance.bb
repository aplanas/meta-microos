SUMMARY = "It's a desktop-independent theme switcher for GTK+"
DESCRIPTION = "LXAppearance is part of LXDE project. \
It's a desktop-independent theme switcher for GTK+."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-0.6.3-1.14.aarch64.rpm"
RPM_HASH = "166954fbbc5ecc815ff2c0ea204afe8cd94a46e29af6e690a5b1d3a4dba523f2cc7b5bf219e8883753abd4101c8689e76e4ee4f5edc29896b4841ecd676142b0"

RPROVIDES:${PN} += "application() \
application(lxappearance.desktop) \
lxappearance \
lxappearance(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
