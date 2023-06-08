SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_qa-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "0f7e3a9a9aba49c86dab33e09186ea7b93ba0214ce2446d9dc9561c938954d0d69dbdffccedb6475b562b9c2eee0ab1b361da3b6494f350b324d26c2ec543d4d"

RPROVIDES:${PN} += "libwx_gtk3u_qa-suse.so.9.0.0()(64bit) libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_qa-suse9_0_0 libwx_gtk3u_qa-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
