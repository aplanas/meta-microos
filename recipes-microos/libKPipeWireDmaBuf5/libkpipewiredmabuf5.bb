SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWireDmaBuf5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "be1b2d71bda5ca7f40a9d12810e07962c8bbffe63fc4dce11eb062defa197b22b98bf6cd3237dd6f469379c755ae2b6fa2687213389da9d200a71146da3cea34"

RPROVIDES:${PN} += "libKPipeWireDmaBuf.so.5()(64bit) libKPipeWireDmaBuf5 libKPipeWireDmaBuf5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPipeWire.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdrm.so.2()(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
