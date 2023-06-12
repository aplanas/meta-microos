SUMMARY = "Development files for the X11 Screen Saver extension library"
DESCRIPTION = "The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics. \
 \
This package contains the development headers for the library found \
in libXss1."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libXss-devel-1.2.4-1.2.aarch64.rpm"
RPM_HASH = "2112e6e15576e8ab1ff2a19ac500a8f5ff88537afbb79fac7438bec50920969d9e01d07004d192c77948b579c3c4dd3215f3d74ae4bdb68bf6e4c034812f866b"

RPROVIDES:${PN} += "libXScrnSaver-devel \
libXss-devel \
libXss-devel(aarch-64) \
pkgconfig(xscrnsaver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXss1 \
pkgconfig(scrnsaverproto) \
pkgconfig(x11) \
pkgconfig(xext)"

inherit rpm
