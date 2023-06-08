SUMMARY = "Shared libraries for TwoLame"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's. \
 \
This package contains the shared libraries for TwoLame."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame0-0.4.0-1.14.aarch64.rpm"
RPM_HASH = "6e45d51c8fdb9fc2143bae45e479fe0d8bd9ed8dd864e36fc093142e2c5ec42e462b02cd84daca23618a786be79459a964a407bee72be1b657f313a851a887d9"

RPROVIDES:${PN} += "libtwolame.so.0()(64bit) libtwolame0 libtwolame0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
