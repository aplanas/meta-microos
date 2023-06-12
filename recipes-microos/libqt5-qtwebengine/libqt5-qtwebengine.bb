SUMMARY = "Qt 5 WebEngine Library"
DESCRIPTION = "Qt WebEngine provides functionality for rendering regions of dynamic \
web content. \
 \
The functionality in Qt WebEngine is divided into the following \
modules: \
 \
* QtWebEngineCore: Provides public API shared by both QtWebEngine and \
  QtWebEngineWidgets \
* QtWebEngine: Provides QML types for rendering web content within a \
  QML application \
* QtWebEngineWidgets: Provides a web browser engine as well as C++ \
  classes to render and interact with web content"
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "c1b3e124fe3e61e89c83073003826aee21523546b76fe6ef496f96a827803bbaba7003ab57479c22aa96a3e4e8544c1f1341435f9455f511012dd7c134f597d4"

RPROVIDES:${PN} += "libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5(Qt_5.0)(64bit) \
libQt5WebEngine.so.5(Qt_5.1)(64bit) \
libQt5WebEngine.so.5(Qt_5.10)(64bit) \
libQt5WebEngine.so.5(Qt_5.11)(64bit) \
libQt5WebEngine.so.5(Qt_5.12)(64bit) \
libQt5WebEngine.so.5(Qt_5.13)(64bit) \
libQt5WebEngine.so.5(Qt_5.14)(64bit) \
libQt5WebEngine.so.5(Qt_5.15)(64bit) \
libQt5WebEngine.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WebEngine.so.5(Qt_5.2)(64bit) \
libQt5WebEngine.so.5(Qt_5.3)(64bit) \
libQt5WebEngine.so.5(Qt_5.4)(64bit) \
libQt5WebEngine.so.5(Qt_5.5)(64bit) \
libQt5WebEngine.so.5(Qt_5.6)(64bit) \
libQt5WebEngine.so.5(Qt_5.7)(64bit) \
libQt5WebEngine.so.5(Qt_5.8)(64bit) \
libQt5WebEngine.so.5(Qt_5.9)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.0)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.1)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.10)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.11)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.12)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.13)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.14)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.15)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.2)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.3)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.4)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.5)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.6)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.7)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.8)(64bit) \
libQt5WebEngineCore.so.5(Qt_5.9)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.0)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.1)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.10)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.11)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.12)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.13)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.14)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.15)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.2)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.3)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.4)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.5)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.6)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.7)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.8)(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5.9)(64bit) \
libqt5-qtwebengine \
libqt5-qtwebengine(aarch-64) \
libqtwebengineplugin.so()(64bit) \
qt5qmlimport(QtWebEngine.1) \
qt5qmlimport(QtWebEngine.Controls1Delegates.1)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Network5 \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libQtQuick5 \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libevent-2.1.so.7()(64bit) \
libexpat.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libharfbuzz-subset.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libminizip.so.1()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.11)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.22)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12.3)(64bit) \
libopus.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libre2.so.10()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvpx.so.8()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libxcb.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.6)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libxslt.so.1(LIBXML2_1.0.30)(64bit) \
libxslt.so.1(LIBXML2_1.1.18)(64bit) \
libxslt.so.1(LIBXML2_1.1.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
