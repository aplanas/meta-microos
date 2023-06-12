SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_qa-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "02a8938e99cbccc9d7a13535d8eb92068d3d896b4bd79a7d6843fae7ba3f167c389457acfd6149347f896f2371b4004a7bbce54cf76e9d09c4d0a94f521eb330"

RPROVIDES:${PN} += "libwx_gtk2u_qa-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_qa-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_qa-suse-nostl3_0_5 libwx_gtk2u_qa-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5()(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
