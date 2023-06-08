SUMMARY = "Plugin rav1e encoder for AVIF"
DESCRIPTION = "This plugin provides the rav1e encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.1"

RPM_NAME = "libheif-rav1e-1.16.1-2.1.aarch64.rpm"
RPM_HASH = "9286b2ed4651721abc186c7987adfe9e215cfbcd92755e11c8d7f80a98fd36f1c0f633ac3a209ac1d1263deeee50779edfafef5debf113305e711d5eab2983ed"

RPROVIDES:${PN} += "libheif-rav1e libheif-rav1e(aarch-64) libheif-rav1e.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libheif.so.1()(64bit) librav1e.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
