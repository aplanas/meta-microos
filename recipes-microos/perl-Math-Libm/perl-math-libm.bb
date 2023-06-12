SUMMARY = "Perl extension for the C math library, libm"
DESCRIPTION = "This module is a translation of the C _math.h_ file. It exports the \
following selected constants and functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.00"

RPM_NAME = "perl-Math-Libm-1.00-3.36.aarch64.rpm"
RPM_HASH = "fb6550f8bd4247c8a6badab6846fb273bcd9d998284e053af5db45214277eab7cd96e18658ee23a88d81858cc33ae7ee2c2e4bd2482e5c69e105653d39d8cfd4"

RPROVIDES:${PN} += "perl(Math::Libm) \
perl-Math-Libm \
perl-Math-Libm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
