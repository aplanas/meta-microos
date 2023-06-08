SUMMARY = "Select 3D Athena Widgets as a replacement for Athena Widgets"
DESCRIPTION = "Installation of this package will cause programs utilizing the Athena \
Widget Toolkit to instead use the 3D Athena Widget set. \
 \
If any problems arise using or starting X Window System programs, \
remove this package."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xaw3dd-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "968ee4c41e183f7d9f9f064eda5a0ece994edfeea9f23fae04623970992a740a1a85357f078636cbb115c7e49733be76adac38be8ca1a17fb5298e1272b2df32"

RPROVIDES:${PN} += "config(xaw3dd) libXaw.so.6()(64bit) libXaw.so.7()(64bit) libXaw.so.8()(64bit) xaw3dd xaw3dd(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw3d6 libXaw3d7 libXaw3d8 libXext.so.6()(64bit) libXmu.so.6()(64bit) libXpm.so.4()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
