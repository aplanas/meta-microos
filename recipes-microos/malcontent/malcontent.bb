SUMMARY = "Parental control system"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "21d386f4457afff9f2395ba32bb414b02936c177556467ac8aac5b40051afc5591506f554780afcdaed731dfee969a737b40fbafad703368a1499cdd43e31dcf"

RPROVIDES:${PN} += "malcontent malcontent(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmalcontent-0.so.0()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) typelib(GLib) typelib(Gio) typelib(Malcontent)"

inherit rpm
