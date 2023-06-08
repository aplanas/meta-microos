SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-guile-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "2e13940576261f2aab34b97bd2de1af119626b1595b578fa94bb6f23f3adb727108681287aa0c94cdb856a963c3640b1dfd81882d75b98ba76276f5d8c769568"

RPROVIDES:${PN} += "graphviz-guile graphviz-guile(aarch-64) libgv_guile.so()(64bit)"
RDEPENDS:${PN} += "graphviz guile ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libgvc.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
