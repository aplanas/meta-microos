SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-fastcgi-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "d04bba36a7c6aeea9a39c9a71e9e38d4d75727875dc1c1858f60923c09a44d24019df10918ef48455974f346dedf16b7476efbafce9cdebca5cf99eecec01445"

RPROVIDES:${PN} += "config(php8-fastcgi) php-cgi php-fastcgi php-sapi php8-fastcgi php8-fastcgi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.11)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) php"

inherit rpm
