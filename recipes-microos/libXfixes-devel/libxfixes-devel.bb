SUMMARY = "Development files for the X11 Xfixes extension library"
DESCRIPTION = "The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol. \
 \
This package contains the development headers for the library found \
in libXfixes3."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "libXfixes-devel-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "13dff5248fa6fd2d7a3c8603b8f9c3d2c5d84b347fe393d117106e8e55bb664c68112e0b1382c91eccd7c7b34a60821f26d6caa5eaa275e05da3bbe9a3f23df9"

RPROVIDES:${PN} += "libXfixes-devel libXfixes-devel(aarch-64) pkgconfig(xfixes) xorg-x11-libXfixes-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXfixes3 pkgconfig(fixesproto) pkgconfig(x11) pkgconfig(xproto)"

inherit rpm
