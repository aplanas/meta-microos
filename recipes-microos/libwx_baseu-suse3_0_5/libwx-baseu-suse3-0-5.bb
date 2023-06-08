SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "92d3331306b8bd07b8a2dd36d5a5784242576424f16a4584280d39beab23c975c3a4948e8e9b798ec89bed130b612dec1c85d2c71b0535b0f11ea9973e016935"

RPROVIDES:${PN} += "libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu-suse3_0_5 libwx_baseu-suse3_0_5(aarch-64) wxWidgets"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
