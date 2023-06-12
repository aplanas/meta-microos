SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python39-opengl-3.1.6-1.6.noarch.rpm"
RPM_HASH = "f2fd73b6e97cec41e34d389a79eae33c4bc0a2415b1f6af15586385b1fdeb3ce4ee843a5c1ec3454413a1d9283a7af0dcf14aba22c7c8dcfe9a92c47eb318d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyopengl) \
python39-PyOpenGL \
python39-opengl \
python3dist(pyopengl)"
RDEPENDS:${PN} += "Mesa-dri \
python(abi)"

inherit rpm
