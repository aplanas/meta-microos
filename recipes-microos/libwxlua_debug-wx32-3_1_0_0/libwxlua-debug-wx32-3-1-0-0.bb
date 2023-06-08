SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debug-wx32-3_1_0_0-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "c4567edb86ea3cbd6147a7f549c41d9d0be98f4193e10d0f7b93d7ec5ad3560f2778ef1847e725a8cb8f8a94fd8994129f5a3ead0fda0f2bb849ddd0a4ba168a"

RPROVIDES:${PN} += "libwxlua_debug-wx32-3_1_0_0 libwxlua_debug-wx32-3_1_0_0(aarch-64) libwxlua_debug-wx32gtk3u-3.1.0.0.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwxlua-wx32gtk3u-3.1.0.0.so()(64bit)"

inherit rpm
