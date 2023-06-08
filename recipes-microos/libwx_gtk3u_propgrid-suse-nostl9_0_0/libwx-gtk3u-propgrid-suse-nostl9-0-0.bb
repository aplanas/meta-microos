SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_propgrid-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "db0aeb1655e3369809a95c277b8800f99304ef95436e72bded58e3aca65815c2d6a6f008afc51ed8632f4d69d256bba92056de5de2e10ffa4c216a976f87866b"

RPROVIDES:${PN} += "libwx_gtk3u_propgrid-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_propgrid-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_propgrid-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_propgrid-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_propgrid-suse-nostl9_0_0 libwx_gtk3u_propgrid-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
