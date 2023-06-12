SUMMARY = "Development files for the X Damage Extension library"
DESCRIPTION = "The X Damage Extension allows applications to track modified regions \
of drawables. \
 \
This package contains the development headers for the library found \
in libXdamage1."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXdamage-devel-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "3cf994c1169d1953ef7bbbddbfe8c9dcb686e3001fc1934977e9aaeaba041326a1e803bec6896b305a0394b9f5f1bc4420e55f8ed30971be9adf186247aa1e1a"

RPROVIDES:${PN} += "libXdamage-devel \
libXdamage-devel(aarch-64) \
pkgconfig(xdamage)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXdamage1 \
pkgconfig(damageproto) \
pkgconfig(x11) \
pkgconfig(xfixes) \
pkgconfig(xproto)"

inherit rpm
