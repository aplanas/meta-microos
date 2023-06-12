SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libupsclient6-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "c2d48fc7fa341dcf365f7f7abce11a39d9cb655e9b6a934ffb4864cd3a2d0041bae86b690bae6b31836460381ef61bbf419da6baea53b7c20d8691350df6f3a0"

RPROVIDES:${PN} += "libupsclient.so.6()(64bit) \
libupsclient6 \
libupsclient6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
