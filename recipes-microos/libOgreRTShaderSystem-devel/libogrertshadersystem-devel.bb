SUMMARY = "Development files for the OGRE Runtime Shader System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Runtime Shader System \
(RTSS) component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreRTShaderSystem-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "d563246b2af32a01b9a8b838a084a18bbd26d4873f42a9e6aadfe68ab8512405a24d8ed8b8091917866bf3491f86c0c7dd24604405582f2506b172bc02e015cc"

RPROVIDES:${PN} += "libOgreRTShaderSystem-devel libOgreRTShaderSystem-devel(aarch-64) pkgconfig(OGRE-RTShaderSystem)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOgreRTShaderSystem13_5 pkgconfig(OGRE)"

inherit rpm
