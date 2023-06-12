SUMMARY = "PSR Extension Module"
DESCRIPTION = "This extension provides the accepted PSR interfaces, so they can be used in an extension."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "php8-psr-1.2.0-2.5.aarch64.rpm"
RPM_HASH = "c56021008afe43f952e9dfd030ef3602b06870e4386cc62d5ffb3ddeea5f2abc8f487ba8548e572af3fbdd76ae81a8a80fa0905ffe83914e65f158f599120c9d"

RPROVIDES:${PN} += "config(php8-psr) php8-psr php8-psr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php(api) php(zend-abi)"

inherit rpm
