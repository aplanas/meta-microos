SUMMARY = "PHP bindings for the libssh2 library"
DESCRIPTION = "This package provides PHP bindings for the libssh2 library"
LICENSE = "PHP-3.01"

PV = "1.3.1"

RPM_NAME = "php8-ssh2-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "8dd6b4d06db10cde352d10ec56a060ddc28f49b82a2cdd5df19748a72b872e21c5379fba8726809f10d0b89b4a932a50fc5189d01cbb7d186b1bc51cb43741ee"

RPROVIDES:${PN} += "config(php8-ssh2) php-ssh2 php8-ssh2 php8-ssh2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libssh2.so.1()(64bit) php(api) php(zend-abi)"

inherit rpm
