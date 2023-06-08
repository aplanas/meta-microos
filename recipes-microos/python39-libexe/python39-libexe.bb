SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python39-libexe-20210424-4.6.aarch64.rpm"
RPM_HASH = "c291ed0881f87e4ae6eeff251a8010bae8b0636977516fbcdba0a1b048057db7137922fb82f61fc1b5cf58fe1982786d7f1d603fec753f0fa21d6b1013505dea"

RPROVIDES:${PN} += "python39-libexe python39-libexe(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libexe.so.1()(64bit) libexe.so.1(V_20210424)(64bit) python(abi)"

inherit rpm
