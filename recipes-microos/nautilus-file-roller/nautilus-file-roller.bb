SUMMARY = "File-roller extension for Nautilus"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "nautilus-file-roller-43.0-1.3.aarch64.rpm"
RPM_HASH = "9f48f083fe18c09ded7503f80979073866f81cb09e6fe2760231f2a7eb00d446b2ee81599dcbcd4ba67c6406fe6255ea73f5fb267cbb46a1affc38699aa254bc"

RPROVIDES:${PN} += "libnautilus-fileroller.so()(64bit) \
nautilus-file-roller \
nautilus-file-roller(aarch-64)"
RDEPENDS:${PN} += "file-roller \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnautilus-extension.so.4()(64bit) \
nautilus"

inherit rpm
