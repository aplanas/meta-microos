SUMMARY = "Qt 5 Multimedia Library"
DESCRIPTION = "Qt Multimedia is a module that provides a set of QML types and C++ \
classes to handle multimedia content. It also provides APIs to access \
the camera and radio functionality. The included Qt Audio Engine \
provides types for 3D positional audio playback and content \
management."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libQt5Multimedia5-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "0e8cbe88e18b2b47fd46059c825c03466ced369cfabb4087fdd7162fc865ff69a53ea922d96400ff13622f349e013c6a627ff2a30fb57b2a999a951567e828bc"

RPROVIDES:${PN} += "libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5(Qt_5.0)(64bit) \
libQt5Multimedia.so.5(Qt_5.1)(64bit) \
libQt5Multimedia.so.5(Qt_5.10)(64bit) \
libQt5Multimedia.so.5(Qt_5.11)(64bit) \
libQt5Multimedia.so.5(Qt_5.12)(64bit) \
libQt5Multimedia.so.5(Qt_5.13)(64bit) \
libQt5Multimedia.so.5(Qt_5.14)(64bit) \
libQt5Multimedia.so.5(Qt_5.15)(64bit) \
libQt5Multimedia.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Multimedia.so.5(Qt_5.2)(64bit) \
libQt5Multimedia.so.5(Qt_5.3)(64bit) \
libQt5Multimedia.so.5(Qt_5.4)(64bit) \
libQt5Multimedia.so.5(Qt_5.5)(64bit) \
libQt5Multimedia.so.5(Qt_5.6)(64bit) \
libQt5Multimedia.so.5(Qt_5.7)(64bit) \
libQt5Multimedia.so.5(Qt_5.8)(64bit) \
libQt5Multimedia.so.5(Qt_5.9)(64bit) \
libQt5Multimedia5 \
libQt5Multimedia5(aarch-64) \
libQt5MultimediaGstTools.so.5()(64bit) \
libQt5MultimediaGstTools.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5MultimediaQuick.so.5()(64bit) \
libQt5MultimediaQuick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.0)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.1)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.10)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.11)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.12)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.13)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.14)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.15)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.2)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.3)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.4)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.5)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.6)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.7)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.8)(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5.9)(64bit) \
libdeclarative_audioengine.so()(64bit) \
libdeclarative_multimedia.so()(64bit) \
libeglvideonode.so()(64bit) \
libgstaudiodecoder.so()(64bit) \
libgstcamerabin.so()(64bit) \
libgstmediacapture.so()(64bit) \
libgstmediaplayer.so()(64bit) \
libqtaudio_alsa.so()(64bit) \
libqtmedia_pulse.so()(64bit) \
libqtmultimedia_m3u.so()(64bit) \
qt5qmlimport(QtAudioEngine.1) \
qt5qmlimport(QtMultimedia.5)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstphotography-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenal.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
qt5qmlimport(QtMultimedia.5) \
qt5qmlimport(QtQuick.2)"

inherit rpm
