SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_xml-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "fc4841bdbbfbd7cf68cda40188d0a234b2e0d83e005a125b2709409d298f99f3a7807d640522e89e3712868109353aaaca5e7a02e848767c6f907ef01b02ec9a"

RPROVIDES:${PN} += "libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_baseu_xml-suse-nostl9_0_0 libwx_baseu_xml-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
