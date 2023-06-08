SUMMARY = "Extensible deep packet inspection library"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. nDPI was modified to \
be more suitable for traffic monitoring applications, by disabling \
specific features that slow down the DPI engine while being them \
un-necessary for network traffic monitoring."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "libndpi4-4.0-1.8.aarch64.rpm"
RPM_HASH = "087aabd9fc0a8fea8f3dfda1c7398dec6fbd10a0e5eeaf58d756b517a4efaf50b115def4ab37c06082abbec1432b9082f4902df75e6f764f39f2a1eb1141ea57"

RPROVIDES:${PN} += "libndpi.so.4()(64bit) libndpi4 libndpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) ndpi-common"

inherit rpm
