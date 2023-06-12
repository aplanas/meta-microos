SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw6-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "e96251e05f6ed37b4f7bf28ba8e738c3eaa6463792f3a9f21e8d5f9a305feae8be2470a0c8de9cad1cb3c4946410bbd95eee8c8e3e70cd3b5cc3c1d3f86b5ce5"

RPROVIDES:${PN} += "libXaw.so.6()(64bit) \
libXaw6 \
libXaw6(aarch-64) \
libXaw6.so.6"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
