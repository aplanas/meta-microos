SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-ext-1_0-0-41-2.8.aarch64.rpm"
RPM_HASH = "34ea140f74c738bc2ff74c239a01a9078c6715727196413db5cacbb4d21355414a1bce94753716bd53f25830c44c002d1abcda73e752d1ff97f908d1dd607166"

RPROVIDES:${PN} += "libgitg-ext-1.0.so.0()(64bit) \
libgitg-ext-1_0-0 \
libgitg-ext-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgee-0.8.so.2()(64bit) \
libgitg-1.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
