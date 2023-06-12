SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_richtext-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "7738af7d5870cce18aa8a98879501e0057a638f8ba73331650cfde67cae0b1b283c31339d5b82428d82998a8a24a717b5c1f717d375edb712dea816e2662bdc2"

RPROVIDES:${PN} += "libwx_gtk3u_richtext-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_richtext-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_richtext-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_richtext-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_richtext-suse-nostl9_0_0 libwx_gtk3u_richtext-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_html-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_html-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
