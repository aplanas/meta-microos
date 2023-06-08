SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "13053158593b7432ace8423a9003ef7ed2823a329d1134874b2845d63c28628cabed5b61c08a4834456a117467b37bfc3ec3fee715be4456cc8f71197bbe2c34"

RPROVIDES:${PN} += "libwx_baseu_xml-suse-nostl.so.3.0.5()(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu_xml-suse-nostl3_0_5 libwx_baseu_xml-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
