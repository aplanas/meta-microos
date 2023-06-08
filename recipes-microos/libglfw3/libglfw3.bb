SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw3-3.3.8-1.3.aarch64.rpm"
RPM_HASH = "cb80de5766c2567442bdf5320c46fcfe21653148146bdedbb4d98e88e0fddc4468415808c0c6762087f8fbefde6402c1def2e74ef95da888f0e26a1593ba5089"

RPROVIDES:${PN} += "libglfw.so.3()(64bit) libglfw3 libglfw3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
