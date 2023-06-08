SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_propgrid-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "f5fe04d03f6ece85ad5ca2cd48ca2b5e7acba5acda21f784f317770280db787057a2ad8433707fc027c83d6bb7869a86279744335cd253cf811f24fa61cf7cb4"

RPROVIDES:${PN} += "libwx_gtk3u_propgrid-suse.so.9.0.0()(64bit) libwx_gtk3u_propgrid-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_propgrid-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_propgrid-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_propgrid-suse9_0_0 libwx_gtk3u_propgrid-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
