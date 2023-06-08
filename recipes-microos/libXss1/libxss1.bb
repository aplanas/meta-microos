SUMMARY = "X11 Screen Saver extension client library"
DESCRIPTION = "The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libXss1-1.2.4-1.2.aarch64.rpm"
RPM_HASH = "8ea1e7c5c2eb18483ac4756dde4ea0f43b70176e4292c245d0db98ab9699566b6b37e0b95e0d7f25054f91216253e5ca487c142e4a81d78b2ef3397685c8c75c"

RPROVIDES:${PN} += "libXScrnSaver libXss.so.1()(64bit) libXss1 libXss1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
