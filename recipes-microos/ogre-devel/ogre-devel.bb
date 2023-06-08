SUMMARY = "Development files for the Ogre Engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "367eaebbb2f49b1154bba90b3b54440e8d7d47abd31cab51b255e3b3ae0bff559e4fbc670adcf915d146fa13396ed980320458aa1a4d5603f39afaffc4f65709"

RPROVIDES:${PN} += "ogre-devel ogre-devel(aarch-64)"
RDEPENDS:${PN} += "pkgconfig(OGRE) pkgconfig(OGRE-Bites) pkgconfig(OGRE-MeshLodGenerator) pkgconfig(OGRE-Overlay) pkgconfig(OGRE-Paging) pkgconfig(OGRE-Property) pkgconfig(OGRE-RTShaderSystem) pkgconfig(OGRE-Terrain) pkgconfig(OGRE-Volume)"

inherit rpm
