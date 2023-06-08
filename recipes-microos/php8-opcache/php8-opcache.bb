SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-opcache-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "d06cfe0c99792e705e80d22558893b5196b7e73477929379b6b01051d23d81836c1e06d0c7b2d40e1fcd10f20a3aeff55a64f96ec8cdb6c0e877d3f255b300b6"

RPROVIDES:${PN} += "config(php8-opcache) php-opcache php8-opcache php8-opcache(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) php"

inherit rpm
