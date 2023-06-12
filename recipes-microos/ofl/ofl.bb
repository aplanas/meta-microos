SUMMARY = "Open File Lister from hxtools"
DESCRIPTION = "ofl lists processes (and can send signals to them) that have \
directories or files in specific locations in use. It differs from \
lsof/fuser in that it can scan recursively and won't bluntly look at \
an entire mount."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "ofl-20230411-1.1.aarch64.rpm"
RPM_HASH = "3a87a0d34dd8cdc29dea0fcf337e301f2292e55fb842d1dee24e3249395cdfd6af83f4df1efd837bd3cab787713c15590e76700a9fc7757f67704038440fbfbf"

RPROVIDES:${PN} += "ofl \
ofl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHX.so.32()(64bit) \
libHX.so.32(LIBHX_3.25)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
