SUMMARY = "Library for exact computation with real and complex numbers"
DESCRIPTION = "A C library for exact computation with real and complex numbers. \
 \
The basic idea behind Calcium is to represent numbers as elements of \
formal fields Q(a_1,…,a_n) where the extension numbers a_k can be \
algebraic or transcendental."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.1"

RPM_NAME = "libcalcium0-0.4.1-1.9.aarch64.rpm"
RPM_HASH = "cf1f20612083c04aaacc3e8e50cc623541970a680b70a6e83e667a8a98cc42f04f21d18509230b1e2115dd909a9ef8f99fbe46040c6aabe6327408cc69353b7b"

RPROVIDES:${PN} += "libcalcium.so.0()(64bit) libcalcium0 libcalcium0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libantic.so.0()(64bit) libarb.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libflint.so.17()(64bit) libgmp.so.10()(64bit)"

inherit rpm
