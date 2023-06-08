SUMMARY = "X graphics demo"
DESCRIPTION = "xgc is an X11 graphics demo that shows various features of the X11 \
core protocol graphics primitives."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xgc-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "d1d3f6df0fbd276dfab9bbc74d5ef44a840b71169f38743f0206a57e23745845fae2446a7236860618f33732dcc9c71edd46d9380267251e9c307edc510a9b10"

RPROVIDES:${PN} += "xgc xgc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
