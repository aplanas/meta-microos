SUMMARY = "Qt libraries for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the Qt libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi3-qt-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "f20a935e66b9b9556ac7fe2e8937246ce665f5197e446310a359c22da4a18114c015ef0eca575923110fd60b7f9924c394dd0bf3792d69cb0f457fcd42656476"

RPROVIDES:${PN} += "libqmlvtkplugin.so()(64bit) \
libvtkGUISupportQt.so.1()(64bit) \
libvtkGUISupportQtQuick.so.1()(64bit) \
libvtkGUISupportQtSQL.so.1()(64bit) \
libvtkRenderingQt.so.1()(64bit) \
libvtkViewsQt.so.1()(64bit) \
vtk-openmpi3-qt \
vtk-openmpi3-qt(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvtk1-openmpi3 \
libvtkCommonCore.so.1()(64bit) \
libvtkCommonDataModel.so.1()(64bit) \
libvtkCommonExecutionModel.so.1()(64bit) \
libvtkCommonSystem.so.1()(64bit) \
libvtkFiltersExtraction.so.1()(64bit) \
libvtkFiltersSources.so.1()(64bit) \
libvtkFiltersTexture.so.1()(64bit) \
libvtkIOSQL.so.1()(64bit) \
libvtkInfovisCore.so.1()(64bit) \
libvtkInteractionStyle.so.1()(64bit) \
libvtkInteractionWidgets.so.1()(64bit) \
libvtkRenderingCore.so.1()(64bit) \
libvtkRenderingLabel.so.1()(64bit) \
libvtkRenderingOpenGL2.so.1()(64bit) \
libvtkViewsCore.so.1()(64bit) \
libvtkViewsInfovis.so.1()(64bit) \
libvtksys.so.1()(64bit)"

inherit rpm
