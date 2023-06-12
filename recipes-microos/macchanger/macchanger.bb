SUMMARY = "Utility for viewing/manipulating the MAC address of network interfaces"
DESCRIPTION = "A GNU/Linux utility for viewing/manipulating the MAC address of network interfaces."
LICENSE = "GPL-3.0+"

PV = "1.7.0"

RPM_NAME = "macchanger-1.7.0-1.23.aarch64.rpm"
RPM_HASH = "7970b9d903cf1dd44ba2407e2d02b22bb96f486351e93d1cd69523075ff897905076c36aee595cd2aec5642a4f4910ff5159e47fe2ec0eff5c533ee74e48d572"

RPROVIDES:${PN} += "macchanger \
macchanger(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
