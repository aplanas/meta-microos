SUMMARY = "PHP Memcache client Extension"
DESCRIPTION = "Memcached is a caching daemon designed especially for \
dynamic web applications to decrease database load by \
storing objects in memory. \
This extension allows you to work with memcached through \
handy OO and procedural interfaces. \
The extension allows use to store sessions in memcached \
via memcache."
LICENSE = "PHP-3.0"

PV = "8.2"

RPM_NAME = "php8-memcache-8.2-1.2.aarch64.rpm"
RPM_HASH = "af5268539aa4898217e60b11cea24a713524622f865c6557317fd757efa17f89519a9ac75a94400418276902fb8e44b8ef3863f65bac3d29ae62786384114125"

RPROVIDES:${PN} += "config(php8-memcache) php8-memcache php8-memcache(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libz.so.1()(64bit) php(api) php(zend-abi)"

inherit rpm
