SUMMARY = "Utility to create an X cursor file from a collection of PNG images"
DESCRIPTION = "xcursorgen prepares X11 cursor sets for use with libXcursor."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xcursorgen-1.0.8-1.2.aarch64.rpm"
RPM_HASH = "f04b8bf9a5afb5901f20a77812334a77e4456abe9d607fbb64852c74c2dad8a696294312c9143bd849b3572a242652ba043c542f8c2082bc16b1a75c09ed85c2"

RPROVIDES:${PN} += "xcursorgen \
xcursorgen(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
