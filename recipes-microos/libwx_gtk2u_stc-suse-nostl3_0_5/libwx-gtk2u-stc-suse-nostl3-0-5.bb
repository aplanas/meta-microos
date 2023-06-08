SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "aec2ad59fa05191ef2723bd6849638dc95cb36d80f436451d2766ebca591709daf51df4a088dcde78755fbdf17561a61a7dedb670314273c73299c119470d430"

RPROVIDES:${PN} += "libwx_gtk2u_stc-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_stc-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_stc-suse-nostl3_0_5 libwx_gtk2u_stc-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
