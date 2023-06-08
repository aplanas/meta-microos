SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-embed-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "249a44de1f0cac440329ee314311c6f99fa699f3200314126de301af712c0b0586a0a5aa9a2ca5702d1256979fd544f81eed362495b78d9a3a1c7825bde7b1de"

RPROVIDES:${PN} += "libphp.so()(64bit) php-sapi php8-embed php8-embed(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.11)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) php"

inherit rpm
