SUMMARY = "Osmocom GPRS Packet Control Unit (PCU)"
DESCRIPTION = "Osmocom PCU code (RLC/MAC/PCU) for OpenBTS and OsmoBTS."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "osmo-pcu-1.0.0-1.9.aarch64.rpm"
RPM_HASH = "d77dcdfd2382c27246bbb8cea1167a28145c691d7cae9ef0028354316405991413ee783db7a01e6d0af7e0bf9dbe748c46473d1a024368e4dbe2f4dc873a293d"

RPROVIDES:${PN} += "config(osmo-pcu) osmo-pcu osmo-pcu(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogb.so.14()(64bit) libosmogb.so.14(LIBOSMOGB_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
