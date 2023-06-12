SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-tokenizer-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "74793e75bfbc8ef238dc44f56631adee5b311f25e859f7333ce5244b64a0d3cb07338131c56090e864dc47d6b51f0330552c68b807d2247ee625bacfe2f02f95"

RPROVIDES:${PN} += "config(php8-tokenizer) php-tokenizer php8-tokenizer php8-tokenizer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
