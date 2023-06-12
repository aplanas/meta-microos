SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-readline-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "a41a4520be49e8d633967c7f6425d96f7bc0a22486d81ddc99a14a65b874205a5aa20ac514537c6e0ebdedcb9d70d42fd4d890bdbbd47c373feb171d92c10db8"

RPROVIDES:${PN} += "config(php8-readline) php-readline php8-readline php8-readline(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libedit.so.0()(64bit) php"

inherit rpm
