SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.18"

RPM_NAME = "opencv3-devel-3.4.18-2.5.aarch64.rpm"
RPM_HASH = "d6a024caaab3de63978b2f07e85aeb6b9a950eb2b28e7b0a005cbd0d5acffbde3a3ede7c0f6c7d38666235794340c5665c8495ce4c471af1faaec76c207f3fc9"

RPROVIDES:${PN} += "opencv-qt5-devel opencv3-devel opencv3-devel(aarch-64) pkgconfig(opencv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopencv3_4 opencv3 pkgconfig(gl) pkgconfig(glu) pkgconfig(ice) pkgconfig(sm) pkgconfig(x11) pkgconfig(xext)"

inherit rpm
