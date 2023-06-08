SUMMARY = "X Window System logo"
DESCRIPTION = "The xlogo program simply displays the X Window System logo."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "xlogo-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "fde1649e519c3bac39b04d0bc668fe2d2709b0169f32b8054353fe998a2d75e696e798df9f978b1628e9810f5b6fe820e1f325ffe6e04add8ded7e89274c4989"

RPROVIDES:${PN} += "xlogo xlogo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXmu.so.6()(64bit) libXrender.so.1()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
