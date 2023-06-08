SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "grandorgue-3.11.1-1.1.aarch64.rpm"
RPM_HASH = "d9def7a37faa090fd9aaba87b47dcc189c98c1aca59945f048d16b78475e685a680ca40ee30a3edfc40cd94654d3ad1eb1260eb9e4f7af61de73601f8752503b"

RPROVIDES:${PN} += "application() application(GrandOrgue.desktop) grandorgue grandorgue(aarch-64) libGrandOrgueCore.so.3.11.1()(64bit) libGrandOrgueImages.so.3.11.1()(64bit) metainfo() metainfo(GrandOrgue.appdata.xml) mimehandler(application/x-grandorgue-odf)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libportaudio.so.2()(64bit) librtaudio.so.6()(64bit) librtmidi.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwavpack.so.1()(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_html-suse.so.9.0.0()(64bit) libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) libyaml-cpp.so.0.7()(64bit) libz.so.1()(64bit) libzita-convolver.so.4()(64bit)"

inherit rpm
