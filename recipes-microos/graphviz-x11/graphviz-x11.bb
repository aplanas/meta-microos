SUMMARY = "Graph editors based on X11"
DESCRIPTION = "The lefty/dotty/lneato X11 graph editors included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-x11-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "e97943eed793a2bea1d2beba96378fc8ff248e033358138eca84a326f97e28073e43c452fa73e544d91e7501e7c6363d33f8ab331ad8b1282f4de5af25b40557"

RPROVIDES:${PN} += "graphviz-x11 graphviz-x11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
