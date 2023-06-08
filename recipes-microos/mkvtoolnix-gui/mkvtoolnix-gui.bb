SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "76.0"

RPM_NAME = "mkvtoolnix-gui-76.0-1.1.aarch64.rpm"
RPM_HASH = "371fdbfd377a6127d8b89029ac4d8e84fb260136b188e9f0093c71cd15673864dba89f2d8cbddf3c4b724f2ea1af2ebbc1b6819d66fce6e8f85b253b9bc7f676"

RPROVIDES:${PN} += "application() application(org.bunkus.mkvtoolnix-gui.desktop) metainfo() metainfo(org.bunkus.mkvtoolnix-gui.appdata.xml) mimehandler(application/x-mkvtoolnix-gui-settings) mimehandler(audio/webm) mimehandler(audio/x-matroska) mimehandler(video/webm) mimehandler(video/x-matroska) mimehandler(video/x-matroska-3d) mkvtoolnix-gui mkvtoolnix-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libboost_filesystem.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmark.so.0.30.3()(64bit) libdvdread.so.8()(64bit) libebml.so.5()(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libmatroska.so.7()(64bit) libmatroska.so.7(V_1.7.0)(64bit) libpugixml.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvorbis.so.0()(64bit) mkvtoolnix qt6-multimedia"

inherit rpm
