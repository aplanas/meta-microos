SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-lua-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "4e1bfafd8c236ed840a6721d6c148f9c614438d02fdebfdfef0297bb520321eca9552fe8d7fac95227b308d22bea85da7ab6ff7d251f8a6369ba56b575f5aa94"

RPROVIDES:${PN} += "graphviz-lua graphviz-lua(aarch-64) libgv_lua.so()(64bit)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) lua"

inherit rpm
