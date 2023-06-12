SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python39-libwrc-20230318-1.2.aarch64.rpm"
RPM_HASH = "f76de8952e078d94aa45fa3ccf7a366e1f01896cae864c01cfc2fff269fca2af5643ea90a9bdd57ec569a6a023b9a4fa5cfa4bc71aa8b6f6675d24f950c19321"

RPROVIDES:${PN} += "python39-libwrc \
python39-libwrc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libwrc.so.1()(64bit) \
libwrc.so.1(V_20230318)(64bit) \
python(abi)"

inherit rpm
