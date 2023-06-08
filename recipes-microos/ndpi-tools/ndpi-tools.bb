SUMMARY = "Tools for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the ndpiReader binary."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "ndpi-tools-4.0-1.8.aarch64.rpm"
RPM_HASH = "4acd75aa0dac64881e74ed95f2241b9c276aee6cd136d1d1dfa8cd2fef46ee6a7e29952263abb77f2db0b4f2bbd9882f28fb38cebe1d9d06449b5d07e1bed7fe"

RPROVIDES:${PN} += "ndpi-tools ndpi-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcap.so.1()(64bit)"

inherit rpm
