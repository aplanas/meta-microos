SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sysvmsg-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "494833317879c3cc723dba8698fcac56e531a91fa45fbfed528f041e9b69f8d66319ed41d42b21d384c6082675b57904fce213524b1bdb82144d48e065326178"

RPROVIDES:${PN} += "config(php8-sysvmsg) php-sysvmsg php8-sysvmsg php8-sysvmsg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
