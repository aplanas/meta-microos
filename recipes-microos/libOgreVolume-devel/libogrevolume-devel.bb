SUMMARY = "Development files for the Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the volume component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreVolume-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "ba37d363df9fed00771b8ec025c8d49de714e0f03c75955f1f9646310944e549982ef59f8dba88ac98f827b5b368377ee5322fc8e1e4f40fe3207ab13f6d11cb"

RPROVIDES:${PN} += "libOgreVolume-devel libOgreVolume-devel(aarch-64) pkgconfig(OGRE-Volume)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOgreVolume13_5 pkgconfig(OGRE)"

inherit rpm
