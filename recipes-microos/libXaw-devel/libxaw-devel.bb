SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library. \
 \
This package contains the development headers for the library found \
in libXaw6/libXaw7/libXaw8."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw-devel-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "9d20e63fff1cd13d40891a89981f0be0788b0d5877c30ea3cba19c48d7b3de12f16e4079a7be6ce7c66a0f313f12a70fad038e1fd4d29fa4e1ddf861abb1a990"

RPROVIDES:${PN} += "libXaw-devel libXaw-devel(aarch-64) pkgconfig(xaw6) pkgconfig(xaw7)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXaw6 libXaw7 libXaw8 pkgconfig(x11) pkgconfig(xext) pkgconfig(xmu) pkgconfig(xpm) pkgconfig(xproto) pkgconfig(xt)"

inherit rpm
