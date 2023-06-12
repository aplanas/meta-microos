SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-sodium-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "29ebaaf582725c935e09e1f8614df6a80c1adea14d9f64bea8be52fd60f4d8505d34f2a8d1ecb0d8b900c3dc3829b3b4a34666be8f807275fafd4ea519a24899"

RPROVIDES:${PN} += "config(php8-sodium) \
php-sodium \
php8-sodium \
php8-sodium(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsodium.so.23()(64bit) \
php"

inherit rpm
