SUMMARY = "Development files for the XFree86-DGA extension library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games. \
 \
This package contains the development headers for the library found \
in libXxf86dga1."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXxf86dga-devel-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "abefe653627a337b0fa734dd2ee3b66b0369a434a8dadd658b6695d53d8bfdd531b175b1b13e33d51423475d675abe2ea70f10884e515d218ecb989eb21bb6e1"

RPROVIDES:${PN} += "libXxf86dga-devel libXxf86dga-devel(aarch-64) pkgconfig(xxf86dga)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXxf86dga1 pkgconfig(x11) pkgconfig(xext) pkgconfig(xf86dgaproto)"

inherit rpm
