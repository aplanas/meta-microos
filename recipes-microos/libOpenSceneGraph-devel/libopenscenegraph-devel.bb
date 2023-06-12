SUMMARY = "OpenSceneGraph development files"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenSceneGraph-devel-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "6455465b8d5e918ecd56b793d05a2fcf9dbcc8949d3c9267b5a1033d5072433a42b9aadd43c95a5daf9043872271521d3a30cdc83ac72f34d36bccc0ba704019"

RPROVIDES:${PN} += "libOpenSceneGraph-devel \
libOpenSceneGraph-devel(aarch-64) \
pkgconfig(openscenegraph) \
pkgconfig(openscenegraph-osg) \
pkgconfig(openscenegraph-osgAnimation) \
pkgconfig(openscenegraph-osgDB) \
pkgconfig(openscenegraph-osgFX) \
pkgconfig(openscenegraph-osgGA) \
pkgconfig(openscenegraph-osgManipulator) \
pkgconfig(openscenegraph-osgParticle) \
pkgconfig(openscenegraph-osgShadow) \
pkgconfig(openscenegraph-osgSim) \
pkgconfig(openscenegraph-osgTerrain) \
pkgconfig(openscenegraph-osgText) \
pkgconfig(openscenegraph-osgUtil) \
pkgconfig(openscenegraph-osgViewer) \
pkgconfig(openscenegraph-osgVolume) \
pkgconfig(openscenegraph-osgWidget)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
freeglut-devel \
giflib-devel \
libOpenSceneGraph161 \
libOpenThreads-devel \
libjpeg-devel \
libpng-devel \
pkgconfig(freetype2) \
pkgconfig(librsvg-2.0) \
pkgconfig(libtiff-4) \
pkgconfig(openscenegraph-osg) \
pkgconfig(openscenegraph-osgDB) \
pkgconfig(openscenegraph-osgGA) \
pkgconfig(openscenegraph-osgText) \
pkgconfig(openscenegraph-osgUtil) \
pkgconfig(openscenegraph-osgViewer) \
pkgconfig(openthreads) \
pkgconfig(poppler-glib) \
pkgconfig(sdl2) \
pkgconfig(xrandr)"

inherit rpm
