SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2pim18-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "7900242a18515da58627702b7b04912e9ab987c7d3925659d4781044ad1ae22c5e14d68e537062bc48798c60bbb7f1560cc26bb128cbe81a6235a898e2ade54d"

RPROVIDES:${PN} += "libm2pim.so.18()(64bit) \
libm2pim18 \
libm2pim18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
