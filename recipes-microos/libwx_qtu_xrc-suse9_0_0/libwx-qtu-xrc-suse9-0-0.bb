SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_xrc-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "b147d5344dc4f952a52738924a0aac1559887b702fc089a630859401d04638d6f179d63e11631219a21bb34e8438c45d5ef9bae73d78164942eaf6fbdeb4d5bc"

RPROVIDES:${PN} += "libwx_qtu_xrc-suse.so.9.0.0()(64bit) libwx_qtu_xrc-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_xrc-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_qtu_xrc-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_qtu_xrc-suse9_0_0 libwx_qtu_xrc-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_core-suse.so.9.0.0()(64bit) libwx_qtu_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_html-suse.so.9.0.0()(64bit) libwx_qtu_html-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
