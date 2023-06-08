SUMMARY = "Secondary set of header files for glslang"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
This package contains additional headers that are not officially installed, \
but which some downstream packages rely on."
LICENSE = "BSD-3-Clause"

PV = "12.1.0"

RPM_NAME = "glslang-nonstd-devel-12.1.0-2.1.noarch.rpm"
RPM_HASH = "69225f4fe7ac2154269daa97ef1a7f1fbbed680eced913625826face32b21b1bd09dcc7a1fd68dbc314362f8f4059254fa7018a4b54e1d38cb4ecc6573b9b57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glslang-nonstd-devel"
RDEPENDS:${PN} += "libglslang12"

inherit rpm
