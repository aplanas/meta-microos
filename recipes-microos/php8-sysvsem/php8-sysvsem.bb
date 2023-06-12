SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-sysvsem-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "8fb1551ef2d94f6ec4b2babccda508a2d0fa1f85567169fa35499a6779308d7161b9af8ea2e97233a2253b25f5e13518fb5ed1933dae431d2e539322b24cce48"

RPROVIDES:${PN} += "config(php8-sysvsem) \
php-sysvsem \
php8-sysvsem \
php8-sysvsem(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
