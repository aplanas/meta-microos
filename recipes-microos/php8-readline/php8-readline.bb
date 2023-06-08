SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-readline-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "5777f08463d8d292bdda180570d5c61f81fc754b9de1c1d705b5f8c28345efef93e2d7aa87132ea51e538ec470ae10148ed5989f174d01a6f6658360159eee34"

RPROVIDES:${PN} += "config(php8-readline) php-readline php8-readline php8-readline(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libedit.so.0()(64bit) php"

inherit rpm
