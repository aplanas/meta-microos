SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-enchant-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "6ed5b34c06e8bea66bbd5bb7af637a21ab92d9d7762e6b729135f356eee54a08e56de2e5e835dfc32354cb79ff3d11175bdc43228d5c8ad50d500ee4cbe094f2"

RPROVIDES:${PN} += "config(php8-enchant) php-enchant php8-enchant php8-enchant(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) php"

inherit rpm
