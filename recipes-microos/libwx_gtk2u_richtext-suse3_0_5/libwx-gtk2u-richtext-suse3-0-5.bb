SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "48d64c02d85fd4718bc738bdeffd2eba2c22eb9d78db6466ab9b4e28c0b23dc09fbc7e32956aafd749b740a042d5dc7f685ac06fe4ede6550de4baaee3f187e5"

RPROVIDES:${PN} += "libwx_gtk2u_richtext-suse.so.3.0.5()(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_richtext-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_richtext-suse3_0_5 libwx_gtk2u_richtext-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_xml-suse.so.3.0.5()(64bit) libwx_baseu_xml-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse.so.3.0.5()(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_html-suse.so.3.0.5()(64bit) libwx_gtk2u_html-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
