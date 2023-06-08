SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-enchant-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "3eee2697456009b95cc4ef67a24a83c567bae01724c9d2af8afc16d94113b6688201b762916cdf3bbf9a3aaef2fff2ea6174f99b6ae386473dceb8d0a8fa7e52"

RPROVIDES:${PN} += "config(php8-enchant) php-enchant php8-enchant php8-enchant(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) php"

inherit rpm
