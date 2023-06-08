SUMMARY = "API for creating 3D content and 3D user interfaces based on Qt Quick"
DESCRIPTION = "Qt Quick 3D provides a high-level API for creating 3D content and 3D user \
interfaces based on Qt Quick."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fed05b2975209ae48c33b6bc2b339fb2d14136574ceace144a850b4b6883b9110b5644f97f2975bc67c150479fb3a21ae4955b9cdea85265fc665ebfec21bef3"

RPROVIDES:${PN} += "libassimp.so()(64bit) libassimp.so(Qt_6)(64bit) libassimp.so(Qt_6.0)(64bit) libassimp.so(Qt_6.1)(64bit) libassimp.so(Qt_6.2)(64bit) libassimp.so(Qt_6.3)(64bit) libassimp.so(Qt_6.4)(64bit) libassimp.so(Qt_6.5)(64bit) libassimp.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-quick3d qt6-quick3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Concurrent.so.6()(64bit) libQt6Concurrent.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DAssetImport.so.6()(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DAssetUtils.so.6()(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6)(64bit) libQt6Quick3DGlslParser.so.6()(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DIblBaker.so.6()(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DParticles.so.6()(64bit) libQt6Quick3DParticles.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libassimp.so.5()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
