SUMMARY = "Shared libraries for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the shared libraries for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenSceneGraph161-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "deceed009c6595e45e53b507b31692ec465f06f05d722512f6be5ab232d3bec56f169be351191e6551207d0e902dcb0c4d2969930b3a5e48f81b497120ea6afa"

RPROVIDES:${PN} += "libOpenSceneGraph161 libOpenSceneGraph161(aarch-64) libosg.so.161()(64bit) libosgAnimation.so.161()(64bit) libosgDB.so.161()(64bit) libosgFX.so.161()(64bit) libosgGA.so.161()(64bit) libosgManipulator.so.161()(64bit) libosgParticle.so.161()(64bit) libosgPresentation.so.161()(64bit) libosgShadow.so.161()(64bit) libosgSim.so.161()(64bit) libosgTerrain.so.161()(64bit) libosgText.so.161()(64bit) libosgUI.so.161()(64bit) libosgUtil.so.161()(64bit) libosgViewer.so.161()(64bit) libosgVolume.so.161()(64bit) libosgWidget.so.161()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libOpenThreads.so.21()(64bit) libX11.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
