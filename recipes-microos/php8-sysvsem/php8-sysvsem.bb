SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sysvsem-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "33355661fbe93ee48057028ebafc4f0529d3a1e27fb78aa3c3ec74f6178102edee8f166c992f100bffcc95d30c2e6d0903048bbecba6285c61015f5633ad7a19"

RPROVIDES:${PN} += "config(php8-sysvsem) php-sysvsem php8-sysvsem php8-sysvsem(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
