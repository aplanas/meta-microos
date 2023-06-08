SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sodium-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "6e949e5c83435ac270478f107128a88be8ff333dab221771ca15ff2c2694125fc460779d2810afb8eeec1c5474e9f884ec3850c39e64159ebabf971bf4208e3b"

RPROVIDES:${PN} += "config(php8-sodium) php-sodium php8-sodium php8-sodium(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsodium.so.23()(64bit) php"

inherit rpm
