SUMMARY = "Support library for subtitleeditor"
DESCRIPTION = "Support library for subtitleeditor, a GTK+3 tool to edit subtitles."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "libsubtitleeditor0-0.54.0-4.16.aarch64.rpm"
RPM_HASH = "af64ddf708063b6c79036c63056bd9244fc5a56333afee9bcccec5b9ed407da80d82f4982aa96531005760c19b5b4254ce2317df2481420cb178b220b427b4f0"

RPROVIDES:${PN} += "libsubtitleeditor.so.0()(64bit) libsubtitleeditor0 libsubtitleeditor0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatkmm-1.6.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdkmm-3.0.so.1()(64bit) libgiomm-2.4.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgtkmm-3.0.so.1()(64bit) libpangomm-1.4.so.1()(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml++-2.6.so.2()(64bit)"

inherit rpm
