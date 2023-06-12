SUMMARY = "API for creating 3D content and 3D user interfaces based on Qt Quick"
DESCRIPTION = "Qt Quick 3D provides a high-level API for creating 3D content and 3D user \
interfaces based on Qt Quick."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bb612f8cdc0c7609d6f9f81f6b718e56d0b69939c045eb1acefbbddd0e4d0fb1343f5237a0b37e2d2787d6ae4efb4f69c6475a7254f0aa2504cd4ce73c5229e1"

RPROVIDES:${PN} += "libassimp.so()(64bit) \
libassimp.so(Qt_6)(64bit) \
libassimp.so(Qt_6.0)(64bit) \
libassimp.so(Qt_6.1)(64bit) \
libassimp.so(Qt_6.2)(64bit) \
libassimp.so(Qt_6.3)(64bit) \
libassimp.so(Qt_6.4)(64bit) \
libassimp.so(Qt_6.5)(64bit) \
libassimp.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-quick3d \
qt6-quick3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Concurrent.so.6()(64bit) \
libQt6Concurrent.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DAssetImport.so.6()(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DAssetUtils.so.6()(64bit) \
libQt6Quick3DAssetUtils.so.6(Qt_6)(64bit) \
libQt6Quick3DGlslParser.so.6()(64bit) \
libQt6Quick3DGlslParser.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DIblBaker.so.6()(64bit) \
libQt6Quick3DIblBaker.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DParticles.so.6()(64bit) \
libQt6Quick3DParticles.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DRuntimeRender.so.6()(64bit) \
libQt6Quick3DRuntimeRender.so.6(Qt_6)(64bit) \
libQt6Quick3DRuntimeRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DUtils.so.6()(64bit) \
libQt6Quick3DUtils.so.6(Qt_6)(64bit) \
libQt6Quick3DUtils.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6ShaderTools.so.6()(64bit) \
libQt6ShaderTools.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
