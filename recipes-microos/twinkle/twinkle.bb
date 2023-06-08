SUMMARY = "A SIP Soft Phone"
DESCRIPTION = "Twinkle is a SIP-based soft phone for making telephone calls over IP \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "twinkle-1.10.3-2.1.aarch64.rpm"
RPM_HASH = "c4418a9f6b926f02eb094bfad63070b7b38e14f34d4ea266c916f1d16e7312af062541f1d56e76272e09d9edae0ce60afc547f812b22350eb44cac104573439c"

RPROVIDES:${PN} += "application() application(twinkle.desktop) twinkle twinkle(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libbcg729.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libccrtp.so.3()(64bit) libcommoncpp.so.8()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgsm.so.1()(64bit) libilbc.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmagic.so.1()(64bit) libreadline.so.8()(64bit) libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libspeex.so.1()(64bit) libspeexdsp.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libucommon.so.8()(64bit) libusecure.so.8()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libzrtpcpp.so.4()(64bit) update-desktop-files"

inherit rpm
