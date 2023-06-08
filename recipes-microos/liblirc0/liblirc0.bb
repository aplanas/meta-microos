SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC library. LIRC is a package that supports receiving \
and sending IR signals with the most common IR remote controls."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc0-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "9390d0048880508436b768c98a1105b85392633a724fb9ae0bb13b1c3a5178eab42ead1419dc1d2d7f2b678e1d443249ee50f253eb1f73f99b09ff30a29e0005"

RPROVIDES:${PN} += "liblirc.so.0()(64bit) liblirc0 liblirc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
