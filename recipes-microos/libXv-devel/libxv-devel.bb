SUMMARY = "Development files for the X Video extension library"
DESCRIPTION = "The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass. \
 \
This package contains the development headers for the library found \
in libXv1."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "libXv-devel-1.0.12-1.2.aarch64.rpm"
RPM_HASH = "b98f9d5bf801dd152a98c01c0f71bb0a9fe151903b7185ddaff863c55983843a7a2416b9e25f935f2dfd1ccceb11229514f6fef2122109b9249d9c67c998ef6e"

RPROVIDES:${PN} += "libXv-devel libXv-devel(aarch-64) pkgconfig(xv) xorg-x11-libXv-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXv1 pkgconfig(videoproto) pkgconfig(x11) pkgconfig(xext) pkgconfig(xproto)"

inherit rpm
