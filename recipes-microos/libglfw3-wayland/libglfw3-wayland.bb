SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw3-wayland-3.3.8-1.2.aarch64.rpm"
RPM_HASH = "949bfc37aaa862889c3d15d0bdbd7a6f88f87373311a7fe577b647323cebea6bfee761fd7150a469d1beacacc086166058cf8ff7d628fc5f79ee3aff529c88b7"

RPROVIDES:${PN} += "libglfw.so.3()(64bit) libglfw3 libglfw3-wayland libglfw3-wayland(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
