SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-tokenizer-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "b1ce6279343b64387d4257390f31b611b9c961936cc97cb4b9791831c371c17ebfc64d459c85ef2feaf1d654f56c0913bc85a2fb1ef5756e80adf5f490a80251"

RPROVIDES:${PN} += "config(php8-tokenizer) php-tokenizer php8-tokenizer php8-tokenizer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
