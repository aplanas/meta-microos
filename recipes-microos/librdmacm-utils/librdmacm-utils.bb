SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "librdmacm-utils-42.0-2.3.aarch64.rpm"
RPM_HASH = "e5770ddcdb5eccdaf580f70d2134de55e6ad3e4997be2a049acce419399900bff0eb6ffd92de8593324d418694a81e1e40c9260c132b6f59ecead7c3eacca0b7"

RPROVIDES:${PN} += "librdmacm-tools librdmacm-utils librdmacm-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) librdmacm.so.1(RDMACM_1.1)(64bit) librdmacm.so.1(RDMACM_1.2)(64bit)"

inherit rpm
