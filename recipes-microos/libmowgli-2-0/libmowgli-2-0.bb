SUMMARY = "The mowgli Gen2 development framework for C"
DESCRIPTION = "mowgli is a development framework for C (like GLib) which provides \
flexible algorithms. It can be used as a suppliment to GLib to add \
additional functions (dictionaries, hashes), or replace some of the \
slow GLib list manipulation functions, or stand alone. It also \
provides a hook system and convenient logging for code, as well as a \
block allocator. \
 \
This package holds the shared library from libmowgli v2."
LICENSE = "ISC"

PV = "2.1.3"

RPM_NAME = "libmowgli-2-0-2.1.3-2.12.aarch64.rpm"
RPM_HASH = "5bb80d43032d2ef008128cb5ee9d80941c58a87df7b986e6e591a9f050f84ad750b596bae58cdc2c6689902ac2330ee24bab9313924a4321302109fad52ba51c"

RPROVIDES:${PN} += "libmowgli-2-0 \
libmowgli-2-0(aarch-64) \
libmowgli-2.so.0()(64bit) \
libmowgli-2.so.0(V_2.1.3)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
