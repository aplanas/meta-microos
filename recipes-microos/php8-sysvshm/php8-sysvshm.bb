SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sysvshm-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "2865731406d088161290d0241a8579f50045cf7350ee493f355ef4db106c3bcb089c23392106680a0b9e9843e38525a848d19329ef6e9c2123774057817fa430"

RPROVIDES:${PN} += "config(php8-sysvshm) php-sysvshm php8-sysvshm php8-sysvshm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
