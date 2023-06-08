SUMMARY = "Persistent key-value database"
DESCRIPTION = "redis is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. Redis supports \
different kind of sorting abilities."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "redis-7.0.11-1.1.aarch64.rpm"
RPM_HASH = "6c2a1667eb3525fafc46016bf9207963de917771d0eb0f5febbff3996b5346606b36e50f91996c2e7ade65efb2bf5ded99a4bc5ffdf830ca19a9be6972b8693c"

RPROVIDES:${PN} += "config(redis) group(redis) redis redis(aarch-64) user(redis)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) sysuser-shadow"

inherit rpm
