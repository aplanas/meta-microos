SUMMARY = "Development files for the Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Ogre Terrain System."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreTerrain-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "3f1f5e7abca132ba5a22e51ecc03173491cd389a404aa5ff0879c855a00149d25a9ddde3b57727242a786a158739e0c8d9dc4b00578248405dfc2747a7448754"

RPROVIDES:${PN} += "libOgreTerrain-devel libOgreTerrain-devel(aarch-64) pkgconfig(OGRE-Terrain)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOgreTerrain13_5 pkgconfig(OGRE) pkgconfig(OGRE-Paging)"

inherit rpm
