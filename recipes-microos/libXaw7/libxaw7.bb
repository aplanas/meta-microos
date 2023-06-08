SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw7-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "eeb72197fb8bc7503658146d5b1a19aa2958e19d86fef34303f5a8f19ad5810c0129e2f7f2b54c44bbc418ef9026869c4dd0ef275925f38a16d9d4354fb9ac12"

RPROVIDES:${PN} += "libXaw.so.7()(64bit) libXaw7 libXaw7(aarch-64) libXaw7.so.7"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXmu.so.6()(64bit) libXpm.so.4()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
