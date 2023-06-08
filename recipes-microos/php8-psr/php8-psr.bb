SUMMARY = "PSR Extension Module"
DESCRIPTION = "This extension provides the accepted PSR interfaces, so they can be used in an extension."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "php8-psr-1.2.0-2.4.aarch64.rpm"
RPM_HASH = "cdd32d3bad3949d943e374b0ad72305fa2eeebd22aa303a359427f55d0d81630b4b582e1c96e491458530f8e5a7fb564a65621455959909cf7fc2db4d4f2666a"

RPROVIDES:${PN} += "config(php8-psr) php8-psr php8-psr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php(api) php(zend-abi)"

inherit rpm
