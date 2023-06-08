SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "libKPipeWireDmaBuf5-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "6e63ab752ff951657e8132995d42dcaacc79fd86f4969783b2daae0f7ad907db74721a9c98b2ff2d398243fef64d135275279db658bb691cb5e957de69b7d0f2"

RPROVIDES:${PN} += "libKPipeWireDmaBuf.so.5()(64bit) libKPipeWireDmaBuf5 libKPipeWireDmaBuf5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPipeWire.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdrm.so.2()(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
