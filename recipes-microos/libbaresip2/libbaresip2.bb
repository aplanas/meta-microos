SUMMARY = "Standard library for baresip"
DESCRIPTION = "This package contains the shared library needed to run programs compiled with \
baresip"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libbaresip2-2.10.0-1.7.aarch64.rpm"
RPM_HASH = "e8ebc0359395e505870b473fec5eee1c29ca13ec3708e623b63bcdd66d55e862ac46bd0adc580ea22b489e2b61acef296abbf000b57c1d8056aa3d12f7ebddab"

RPROVIDES:${PN} += "baresip libbaresip.so.2()(64bit) libbaresip2 libbaresip2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libre.so.12()(64bit) librem.so.4()(64bit)"

inherit rpm
