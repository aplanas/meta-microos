SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "45dffd3ec698fae5b06bb2d9a1f32b24b92ad9878189311457e075643f7e8389fbbcc13f61eb207e8eaea856c91fe6f17b050eef33050ca8f0ed5e08d3941d50"

RPROVIDES:${PN} += "libQt6Quick3DAssetUtils.so.6()(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.0)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.1)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.2)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.3)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.4)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.5)(64bit) libQt6Quick3DAssetUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DAssetUtils6 libQt6Quick3DAssetUtils6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DAssetImport.so.6()(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTimeline.so.6()(64bit) libQt6QuickTimeline.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
