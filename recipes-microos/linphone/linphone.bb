SUMMARY = "Web Phone"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.5"

RPM_NAME = "linphone-5.0.5-1.5.aarch64.rpm"
RPM_HASH = "c221f972dd63ed4e4d1b60f228d799f97e722d6b4daecf152749da2226daa9d1104520df3b13abc70b5f672ca0a5131b7178111c850697ef0236918ea2054d24"

RPROVIDES:${PN} += "application() application(linphone.desktop) libapp-plugin.so()(64bit) linphone linphone(aarch-64) metainfo() metainfo(org.linphone.appdata.xml) mimehandler(x-scheme-handler/callto) mimehandler(x-scheme-handler/linphone-config) mimehandler(x-scheme-handler/sip) mimehandler(x-scheme-handler/sip-linphone) mimehandler(x-scheme-handler/sips) mimehandler(x-scheme-handler/sips-linphone) mimehandler(x-scheme-handler/tel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5TextToSpeech.so.5()(64bit) libQt5TextToSpeech.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libbctoolbox.so.1()(64bit) libbelcard.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblinphone++.so.10()(64bit) liblinphone-data liblinphone.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmediastreamer.so.11()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
