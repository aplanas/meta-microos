SUMMARY = "Shared library from unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the shared library from unbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "libunbound8-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "776cd5cd6c4346c69c09af323cba66c6408c97baf0abcc4db4392b6674f1e055e53dede9cffd8888c93d3a6c234167000aef4694b0d7df9293262e0f6541dfcc"

RPROVIDES:${PN} += "libunbound.so.8()(64bit) \
libunbound8 \
libunbound8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libevent-2.1.so.7()(64bit) \
libnghttp2.so.14()(64bit) \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
unbound-anchor"

inherit rpm
