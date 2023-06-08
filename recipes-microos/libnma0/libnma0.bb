SUMMARY = "Shared library for NetworkManager-applet"
DESCRIPTION = "Shared library for NetworkManager-applet."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "ce5b296893de642210e492f2f5275e5418bdb8e9a0447489e11d4459c48dbd5ecd72490224bdeca515bca060524b473210f30ff0c960ec569e713201d2a5b267"

RPROVIDES:${PN} += "libnma libnma-data libnma.so.0()(64bit) libnma.so.0(libnma_1_2_0)(64bit) libnma.so.0(libnma_1_8_0)(64bit) libnma.so.0(libnma_1_8_12)(64bit) libnma.so.0(libnma_1_8_20)(64bit) libnma.so.0(libnma_1_8_22)(64bit) libnma.so.0(libnma_1_8_28)(64bit) libnma.so.0(libnma_1_8_36)(64bit) libnma0 libnma0(aarch-64) nma-data"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgck-2.so.2()(64bit) libgcr-4.so.4()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnm.so.0(libnm_1_6_0)(64bit) libnm.so.0(libnm_1_8_0)(64bit) libnma-glib-schema mobile-broadband-provider-info"

inherit rpm
