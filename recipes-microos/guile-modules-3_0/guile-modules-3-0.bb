SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains guile modules."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "guile-modules-3_0-3.0.8-4.7.aarch64.rpm"
RPM_HASH = "94c7c1c51bbbb02a1980985a7775eec6d6b8fecc1d2a233ace3b172621c55b5aa2099984f07321a0d0454dabcc62b90cee5f40c55794eb140304c6b78bdd00e2"

RPROVIDES:${PN} += "guile-modules-3_0 guile-modules-3_0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libm.so.6()(64bit) libreadline.so.8()(64bit) libunistring.so.5()(64bit)"

inherit rpm
