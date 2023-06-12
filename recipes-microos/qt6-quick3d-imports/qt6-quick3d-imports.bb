SUMMARY = "Qt 6 Quick3D QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3D module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7a25751f08bfd2c16b9ed051813dc80a8c77c7f180b97a6ab31f7b6ef495daac4b6d6c2f35f19cd64270a01dd1d9b7e38e62d5514fc5a60ad4781f9af700343e"

RPROVIDES:${PN} += "libqquick3dplugin.so()(64bit) \
libqquick3dplugin.so(Qt_6)(64bit) \
libqquick3dplugin.so(Qt_6.0)(64bit) \
libqquick3dplugin.so(Qt_6.1)(64bit) \
libqquick3dplugin.so(Qt_6.2)(64bit) \
libqquick3dplugin.so(Qt_6.3)(64bit) \
libqquick3dplugin.so(Qt_6.4)(64bit) \
libqquick3dplugin.so(Qt_6.5)(64bit) \
libqquick3dplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3dassetutilsplugin.so()(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.0)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.1)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.2)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.3)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.4)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.5)(64bit) \
libqtquick3dassetutilsplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3deffectplugin.so()(64bit) \
libqtquick3deffectplugin.so(Qt_6)(64bit) \
libqtquick3deffectplugin.so(Qt_6.0)(64bit) \
libqtquick3deffectplugin.so(Qt_6.1)(64bit) \
libqtquick3deffectplugin.so(Qt_6.2)(64bit) \
libqtquick3deffectplugin.so(Qt_6.3)(64bit) \
libqtquick3deffectplugin.so(Qt_6.4)(64bit) \
libqtquick3deffectplugin.so(Qt_6.5)(64bit) \
libqtquick3deffectplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3dhelpersimplplugin.so()(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.0)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.1)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.2)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.3)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.4)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.5)(64bit) \
libqtquick3dhelpersimplplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3dhelpersplugin.so()(64bit) \
libqtquick3dhelpersplugin.so(Qt_6)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.0)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.1)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.2)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.3)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.4)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.5)(64bit) \
libqtquick3dhelpersplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3dparticleeffectsplugin.so()(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.0)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.1)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.2)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.3)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.4)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.5)(64bit) \
libqtquick3dparticleeffectsplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquick3dparticles3dplugin.so()(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.0)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.1)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.2)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.3)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.4)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.5)(64bit) \
libqtquick3dparticles3dplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-quick3d-imports \
qt6-quick3d-imports(aarch-64) \
qt6qmlimport(QtQuick3D.2) \
qt6qmlimport(QtQuick3D.6) \
qt6qmlimport(QtQuick3D.Effects.6) \
qt6qmlimport(QtQuick3D.Helpers.1) \
qt6qmlimport(QtQuick3D.Helpers.6) \
qt6qmlimport(QtQuick3D.Helpers.impl.6) \
qt6qmlimport(QtQuick3D.MaterialEditor.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DAssetUtils.so.6()(64bit) \
libQt6Quick3DAssetUtils.so.6(Qt_6)(64bit) \
libQt6Quick3DEffects.so.6()(64bit) \
libQt6Quick3DHelpers.so.6()(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6)(64bit) \
libQt6Quick3DHelpersImpl.so.6()(64bit) \
libQt6Quick3DHelpersImpl.so.6(Qt_6)(64bit) \
libQt6Quick3DParticleEffects.so.6()(64bit) \
libQt6Quick3DParticles.so.6()(64bit) \
libQt6Quick3DParticles.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
