SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI. \
 \
This varaint of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "8309c397503395b2c5246017e01dd704c38dcfaebc5091fa8cc03aa59247d7033a2c8ceba8e4be6305e7d163ce309f321bb5b080a21735c93a41b1fb94e00fce"

RPROVIDES:${PN} += "libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu-suse-nostl3_0_5 libwx_baseu-suse-nostl3_0_5(aarch-64) wxWidgets"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
