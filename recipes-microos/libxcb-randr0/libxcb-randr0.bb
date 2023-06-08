SUMMARY = "X11 RandR Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-randr0-1.15-2.2.aarch64.rpm"
RPM_HASH = "4f7ba8f5d90a514d56caf833055f7add9b8f745aadaae34040993e4eae70e005557f195ef8f6a7dc23a68629c87b4a6c152d707ef29ddb9270ff4959c9853fc6"

RPROVIDES:${PN} += "libxcb-randr.so.0()(64bit) libxcb-randr0 libxcb-randr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
