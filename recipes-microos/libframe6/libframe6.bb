SUMMARY = "Touch frame library"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches."
LICENSE = "LGPL-3.0-only & GPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "libframe6-2.5.0+bzr20160809-2.11.aarch64.rpm"
RPM_HASH = "8f14e3d373948644ab7d5438fbf72f5b82f9705677879738ea65209651d7309662d85ba3273a45bc2c9e369fe9ecb45cbaff5e5ecd78c8388ea48e4c5a69aae7"

RPROVIDES:${PN} += "libframe.so.6()(64bit) libframe.so.6(FRAME_2.2)(64bit) libframe.so.6(FRAME_2.4)(64bit) libframe.so.6(FRAME_2.5)(64bit) libframe6 libframe6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
