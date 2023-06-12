SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_xml-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "395ca7c76bc1147db31d56a056c87eae01e0fb20e30fda97f635bc06b9d7af28478e4d759e4473abd50cb0e95fb48e363956c7eee558d8ac2ca1c97b5601b8da"

RPROVIDES:${PN} += "libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_baseu_xml-suse9_0_0 \
libwx_baseu_xml-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
