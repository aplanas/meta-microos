SUMMARY = "IPv4 and IPv6 Networking Utilities"
DESCRIPTION = "This package contains some small network tools for IPv4 and IPv6 like \
ping, arping and tracepath."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "20221126"

RPM_NAME = "iputils-20221126-2.3.aarch64.rpm"
RPM_HASH = "6db465f3e7e2258b39facde2e5c39c913874629b73890bab31f5d23dde58e80a53251ff9b5c88d0740670c701e987c54b5de3e5df2b3047c870dabd519868c8f"

RPROVIDES:${PN} += "/bin/ping \
/sbin/arping \
iputils \
iputils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
permissions"

inherit rpm
