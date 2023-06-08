SUMMARY = "C library defering selection of GL API and window system until runtime"
DESCRIPTION = "Waffle is a C library that allows deferring the selection of GL API \
and window system until runtime. For example, on Linux, Waffle enables \
an application to select X11/EGL with an OpenGL 3.3 core profile, Wayland \
with OpenGL ES2, and other window system / API combinations. \
 \
Waffle's immediate goal is to enable Piglit, Mesa's OpenGL test suite, to test \
multiple GL flavors."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "waffle-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "8f99d7ec307aae23ea89246434cb48c1689500fcdb7793f20de30b127ac4be8c7b4a532261667faaa023a51c78512e02e2bbd39356da5df2e6e1b5438a3c23d9"

RPROVIDES:${PN} += "waffle waffle(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwaffle-1.so.0()(64bit)"

inherit rpm
