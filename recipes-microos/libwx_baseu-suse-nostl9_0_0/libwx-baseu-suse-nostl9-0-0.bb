SUMMARY = "wxWidgets base library"
DESCRIPTION = "Every wxWidgets application must link against this library. It \
contains mandatory classes that any wxWidgets code depends on (e.g. \
wxString) and portability classes that abstract differences between \
platforms. wxBase can be used to develop console-only applications. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "7f760d7d5b855296dac5a87e05015103943253ced98951eae326c233d90848d6627ded17d8b4f066c5191f0b2d4cab75645514804f01fc6eeed571fb8699c02e"

RPROVIDES:${PN} += "libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_baseu-suse-nostl9_0_0 libwx_baseu-suse-nostl9_0_0(aarch-64) wxWidgets"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpcre2-32.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
