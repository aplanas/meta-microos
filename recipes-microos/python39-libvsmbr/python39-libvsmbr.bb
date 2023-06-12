SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python39-libvsmbr-20210509-4.7.aarch64.rpm"
RPM_HASH = "26a01dc78f902e1c2e49fd919fafa710e8c6a88fd67a7f71e74fd83ae669565f71e7b648523081b5e06b0e336e181ff8b0a6c0654bc8b44b20abd5bafc0ca07e"

RPROVIDES:${PN} += "python39-libvsmbr \
python39-libvsmbr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvsmbr.so.1()(64bit) \
libvsmbr.so.1(V_20210509)(64bit) \
python(abi)"

inherit rpm
