SUMMARY = "Development files for GLFW, an OpenGL application framework"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw-devel-3.3.8-2.1.aarch64.rpm"
RPM_HASH = "b026df39447e1ac16ecce78b68177adbb3f2093d68d0571df637133d7382085a1627948fab5f821eb60843291cb99af9e8b065f7375e30cb952627e705acd9ef"

RPROVIDES:${PN} += "cmake(glfw3) libglfw-devel libglfw-devel(aarch-64) pkgconfig(glfw3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libglfw3 pkgconfig(gl) pkgconfig(x11)"

inherit rpm
