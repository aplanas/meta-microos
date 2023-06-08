SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe1-20210424-4.6.aarch64.rpm"
RPM_HASH = "fd5b8b13e51836fd134d36b6fdf2bc2479df82f5350611f326c6bd7a48faed9dbbfa1658f967a311f1620c13747725acc3daf0ddc52aced9b4dea559121e2536"

RPROVIDES:${PN} += "libexe.so.1()(64bit) libexe.so.1(V_20210424)(64bit) libexe1 libexe1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
