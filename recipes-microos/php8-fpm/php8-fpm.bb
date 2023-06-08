SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-fpm-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "29583a60974554a0a04f9dbd517e28b4c385c732dced1e31d26a43db4ae06d5e99292dfb35f6b3874797bfe86493988b59c239fe5f79cb3ef927fc91f7327837"

RPROVIDES:${PN} += "config(php8-fpm) php-fpm php-sapi php8-fpm php8-fpm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(www) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.11)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) php user(wwwrun)"

inherit rpm
