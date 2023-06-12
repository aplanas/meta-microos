SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python311-opengl-3.1.6-1.6.noarch.rpm"
RPM_HASH = "6ca6a622ea5ad3f953938e553ec906684a06ad64a89f6d95156ae03034c44bef4ff579eacf00672e75aa1dcecf3a53eada51c2303125a0faa57cee13f2d859fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyopengl) \
python311-PyOpenGL \
python311-opengl \
python3dist(pyopengl)"
RDEPENDS:${PN} += "Mesa-dri \
python(abi)"

inherit rpm
