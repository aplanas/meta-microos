SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-bz2-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "be8be63625a359d6ba891ba2604210252035d1b0babdce72b516303dd4c6347cc42554124114573e5a0afce8adf53024990ee73a511c1ccd62ab7f14776d1c94"

RPROVIDES:${PN} += "config(php8-bz2) php-bz2 php8-bz2 php8-bz2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
