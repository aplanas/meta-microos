SUMMARY = "Compel library for CRIU"
DESCRIPTION = "This package contains the compel library for CRIU to execute a parasite code."
LICENSE = "LGPL-2.1-only"

PV = "3.17.1"

RPM_NAME = "libcompel1-3.17.1-3.5.aarch64.rpm"
RPM_HASH = "8c632627e5221e0adf25e32bcbc393912c15b488749604e1f6ea4270cb6ee5f8d0c08aee274334620c61d1ce83e259fd333e5660fb85c6250a4d6f0730316a8b"

RPROVIDES:${PN} += "libcompel.so.1()(64bit) \
libcompel1 \
libcompel1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
