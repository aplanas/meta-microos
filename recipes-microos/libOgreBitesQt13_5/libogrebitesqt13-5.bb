SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBitesQt13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "7935d80b284bfe654a8a2b3bc2ab0f6b9be9db9808c565b96283e71418ebfedd8d5852d58faae96d35829f45695943b31aa85401c7a8ec21ffbbef4dc1da96c8"

RPROVIDES:${PN} += "libOgreBitesQt.so.13.5()(64bit) libOgreBitesQt13_5 libOgreBitesQt13_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOgreBites.so.13.5()(64bit) libOgreMain.so.13.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
