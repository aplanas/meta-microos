SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_xml-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "657c1dac3caf1a360f68bd92e7dfc1d2f211022df080c22c3b13dad1be69a73cc339b380c363d84ba533259e69a2dbb1d2e10a5abe58fde03d9fd95c1bf8f249"

RPROVIDES:${PN} += "libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_baseu_xml-suse9_0_0 libwx_baseu_xml-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
