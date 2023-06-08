SUMMARY = "PHP MemcacheD client Extension"
DESCRIPTION = "This extension uses libmemcached library to provide API for \
communicating with memcached servers."
LICENSE = "PHP-3.01"

PV = "3.2.0"

RPM_NAME = "php8-memcached-3.2.0-4.2.aarch64.rpm"
RPM_HASH = "92d1e34b27e89601866fdf4c612b8a0a7fdf4e6856a549c16011fef1e2ed33a635c9508f1221201b3cd6a52c27d507fa083e92f51ac2efbb2fe1ef2bdd4baa77"

RPROVIDES:${PN} += "config(php8-memcached) php8-memcached php8-memcached(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfastlz.so.1()(64bit) libmemcached.so.11()(64bit) libsasl2.so.3()(64bit) libz.so.1()(64bit) php(api) php(zend-abi)"

inherit rpm
