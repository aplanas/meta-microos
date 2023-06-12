SUMMARY = "Includes and more to develop MesaGLw applications"
DESCRIPTION = "This package contains all necessary include files needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLw-devel-8.0.0-7.3.aarch64.rpm"
RPM_HASH = "c7e5aefb9666efe3e9e308f9c7222a57187ef5fab4893be56578fbad733bd9f0612611a9f89fb2487c43d201c6778b8ecd98346bd854b44edb95aaa5ed248b6d"

RPROVIDES:${PN} += "libGLw-devel \
libGLw-devel(aarch-64) \
pkgconfig(glw)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
GLw1 \
pkgconfig(gl) \
pkgconfig(x11) \
pkgconfig(xt)"

inherit rpm
