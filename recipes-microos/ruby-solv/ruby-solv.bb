SUMMARY = "Ruby bindings for the libsolv library"
DESCRIPTION = "Ruby bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "ruby-solv-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "f927fc80d63d262fd10979474b78f913c39ab7ca09719f47e3046debb7bef92f479428662b07bea207ce8af7acda3723dd76c84b859ae5e403669b5a63e6ac4d"

RPROVIDES:${PN} += "ruby-solv \
ruby-solv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
