SUMMARY = "X Resize, Rotate and Reflection extension library"
DESCRIPTION = "The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "libXrandr2-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "5f5e10b737c87317110f69d9ef2702050b8bb1f9040a371c69d325a626df1d1f3b38bae3e4bc9e69954267a0b41303215188e1a6e758785214bc1fcd3ac03365"

RPROVIDES:${PN} += "libXrandr.so.2()(64bit) libXrandr2 libXrandr2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
