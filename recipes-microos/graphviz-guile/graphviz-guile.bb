SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-guile-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "558223938083bf39e5c339eba8ad268a571dbc43d2891234dc7d097eef2915bd7d54435cb8f44c4f1d11e75d7042f5fff2da2c72bcc8411158c8cedadd41713e"

RPROVIDES:${PN} += "graphviz-guile \
graphviz-guile(aarch-64) \
libgv_guile.so()(64bit)"
RDEPENDS:${PN} += "graphviz \
guile \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcgraph.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libguile-3.0.so.1()(64bit) \
libguile-3.0.so.1(GUILE_2.0)(64bit) \
libgvc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
