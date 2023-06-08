SUMMARY = "Development files for the Ogre Overlay component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the overlay component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreOverlay-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "1b8088f624abca566c49224631968a2380be01f0f77ca0d1c43315566f8b8351a9b80b0491eed7116b2c03730c05b4ee8137d2bfbaa70a9bf867c65fd14e6836"

RPROVIDES:${PN} += "libOgreOverlay-devel libOgreOverlay-devel(aarch-64) pkgconfig(OGRE-Overlay)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOgreOverlay13_5 pkgconfig(OGRE)"

inherit rpm
