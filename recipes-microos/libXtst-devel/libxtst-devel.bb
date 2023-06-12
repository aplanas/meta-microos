SUMMARY = "Development files for the X11 XTEST and RECORD extensions"
DESCRIPTION = "The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol. \
 \
This package contains the development headers for the library found \
in libXtst6."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libXtst-devel-1.2.4-1.2.aarch64.rpm"
RPM_HASH = "f692dc67402d01986f9347d59a6f98dca2734cc170771bab2e4e7150e37416c6f2d085685561e6d9605387f673763c7bfe844e32365e3485e5467a327ae36698"

RPROVIDES:${PN} += "libXtst-devel \
libXtst-devel(aarch-64) \
pkgconfig(xtst)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXtst6 \
pkgconfig(recordproto) \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xextproto) \
pkgconfig(xi)"

inherit rpm
