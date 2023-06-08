SUMMARY = "Python3 bindings for the libsolv library"
DESCRIPTION = "Python3 bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "python3-solv-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "d62295cefedbe7c1ce12e7c33930215da2b8f0455949856cc7b10f62d0454e50184b5af9f4034c728ffe173fd6c9d962c184ddc73bb23e5d65941657bee2bb6d"

RPROVIDES:${PN} += "python3-solv python3-solv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) librpm.so.9()(64bit) librpmio.so.9()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit) python(abi)"

inherit rpm
