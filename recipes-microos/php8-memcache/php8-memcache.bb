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

RPM_NAME = "php8-memcache-8.2-1.1.aarch64.rpm"
RPM_HASH = "100d073a5d206bbedc204c47f2cf6885b6a4f1d17bba17badd16635d789858761b870ff46a33bf2dd1db15191dd05645db5907747c62f12357d9d9991e4a3973"

RPROVIDES:${PN} += "config(php8-memcache) php8-memcache php8-memcache(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libz.so.1()(64bit) php(api) php(zend-abi)"

inherit rpm
