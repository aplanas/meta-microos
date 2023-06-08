SUMMARY = "PHP UUID support functions"
DESCRIPTION = "This extension provides functions to generate and analyse \
universally unique identifiers (UUIDs)."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "php8-uuid-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "af6c164844fff9e50610facd26e7b971de98c09aea5e260ae037312b61547c741f4b4d4d036503815cdc77c8a984edbf0c9cf68a2b274488389cc9202e84d40c"

RPROVIDES:${PN} += "config(php8-uuid) php-uuid php8-uuid php8-uuid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libuuid.so.1(UUID_2.31)(64bit) php(api) php(zend-abi)"

inherit rpm
