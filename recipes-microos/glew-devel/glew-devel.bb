SUMMARY = "Development files for glew"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "glew-devel-2.2.0-3.10.aarch64.rpm"
RPM_HASH = "99657a8586be220ac1a1d941031c711e8562becca6c074275227fa2a297441162faab696704fef3731e88e4cf7c2a8579affa95136256b2e6f7030797e7ebbf6"

RPROVIDES:${PN} += "glew-devel \
glew-devel(aarch-64) \
pkgconfig(glew)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLEW2_2 \
pkgconfig(egl) \
pkgconfig(glu) \
pkgconfig(x11) \
pkgconfig(xproto)"

inherit rpm
