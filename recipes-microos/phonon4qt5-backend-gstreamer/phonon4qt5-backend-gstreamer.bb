SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.10.0"

RPM_NAME = "phonon4qt5-backend-gstreamer-4.10.0-1.20.aarch64.rpm"
RPM_HASH = "0c0cd5a5c0e21e297c7408d406a464d7f8409bcfa39fc2fe1ed85ccc830b02ab4fbe8b5624ff39306bde56cd7b3d9f043e2f87b9baf337dc03ada077218a88d7"

RPROVIDES:${PN} += "phonon4qt5-backend phonon4qt5-backend-gstreamer phonon4qt5-backend-gstreamer(aarch-64) phonon4qt5-backend-gstreamer-0_10"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libphonon4qt5 libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
