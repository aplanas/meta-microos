SUMMARY = "Documentation for the Ogre 3D engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains the documentation for OGRE."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-docs-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "c5a91dff0c36fa7d7db61c1d8dc2bbee71ca053905762fda6312815cdb17ec4a259e3f9db663b76ef2d1c7ea4f9cf846adf5d7438a4f50d941e37304f25827a1"

RPROVIDES:${PN} += "ogre-docs ogre-docs(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
