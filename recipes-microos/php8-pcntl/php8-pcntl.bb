SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-pcntl-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "95d0b4c1ed06e0b268c9228d7b8655796c7d298b0afc5c8a17e0f150a8a523dac9c5e054567c684539c7d57841280d9693701105b815776e5a128945a3744c3d"

RPROVIDES:${PN} += "config(php8-pcntl) \
php-pcntl \
php8-pcntl \
php8-pcntl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
