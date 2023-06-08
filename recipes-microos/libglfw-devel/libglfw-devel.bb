SUMMARY = "Development files for GLFW, an OpenGL application framework"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw-devel-3.3.8-1.3.aarch64.rpm"
RPM_HASH = "f60df2af15f58f4717420d1e65263d93018111804b76f236f8ddcd9912090acfc7bf3936269fdca50d36fd1b4b9a4d1cc638be0243abefd100401c93916468e1"

RPROVIDES:${PN} += "cmake(glfw3) libglfw-devel libglfw-devel(aarch-64) pkgconfig(glfw3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libglfw3 pkgconfig(gl) pkgconfig(x11)"

inherit rpm
