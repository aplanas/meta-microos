SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-lua-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "546680de09e930080d5e5325eb9be7d7c089b017860a09751bc887874ebccd25edc241e6943ab3ca25086c00970eb4711f362a27b8481324cf294c6268bb6393"

RPROVIDES:${PN} += "graphviz-lua graphviz-lua(aarch-64) libgv_lua.so()(64bit)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) lua"

inherit rpm
