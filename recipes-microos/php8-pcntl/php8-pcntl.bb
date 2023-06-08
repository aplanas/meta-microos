SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-pcntl-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "82d46a1859349c4190dd381eca5b89e7a5c69631a058b9b79f39d5fe215a675a50f9ffd84c14e8a6e4ec47c1f0ce450334e63b1c5db1a31bfbd72809bbd88c1c"

RPROVIDES:${PN} += "config(php8-pcntl) php-pcntl php8-pcntl php8-pcntl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
