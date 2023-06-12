SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains guile modules."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "guile-modules-3_0-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "1dbbcd96252d66aa212f3ff9607f779e3403f513f3b17947d6326e93115d5502d6bde61844706143e57d295128f5662205d873828a1d7347d43b9b90fa1a204c"

RPROVIDES:${PN} += "guile-modules-3_0 \
guile-modules-3_0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libguile-3.0.so.1()(64bit) \
libguile-3.0.so.1(GUILE_2.0)(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
