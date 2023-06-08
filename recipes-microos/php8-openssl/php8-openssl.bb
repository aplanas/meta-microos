SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-openssl-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "1a27bc94416b31cadbedde4331b03495ccb2dbf04015c07262db6513de69f5a6d3210cf3dbc33933c2ca435563a8097ff52659f266e4c54f9cca538c36519376"

RPROVIDES:${PN} += "config(php8-openssl) php-openssl php8-openssl php8-openssl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) php"

inherit rpm
