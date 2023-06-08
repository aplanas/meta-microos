SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debugger-wx32-3_1_0_0-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "932f2aa4def66b8d0fee1449a4b40223431975f90aff8bf7308abd67afd375b6795e5c95c248e1f859b3863ac0545b92ab311a5df486586a4973242ec75d6a7e"

RPROVIDES:${PN} += "libwxlua_debugger-wx32-3_1_0_0 libwxlua_debugger-wx32-3_1_0_0(aarch-64) libwxlua_debugger-wx32gtk3u-3.1.0.0.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_net-suse.so.9.0.0()(64bit) libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwxlua-wx32gtk3u-3.1.0.0.so()(64bit) libwxlua_bind-wx32gtk3u-3.1.0.0.so()(64bit) libwxlua_debug-wx32gtk3u-3.1.0.0.so()(64bit)"

inherit rpm
