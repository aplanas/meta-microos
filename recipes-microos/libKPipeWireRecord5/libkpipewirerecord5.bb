SUMMARY = "PipeWire integration for KDE Plasma - recording support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the library needed for video and audio capture."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "libKPipeWireRecord5-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "d47b3a46ffcaf354c63a5737dcb40d1d2017a1e08bfed6264fb92e088fe32b8e05445f7c07feca081d7f8353f308eafdfd1997561382fd31a78f7f55bdd03ef9"

RPROVIDES:${PN} += "libKPipeWireRecord.so.5()(64bit) libKPipeWireRecord5 libKPipeWireRecord5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKPipeWire.so.5()(64bit) libKPipeWireDmaBuf.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
