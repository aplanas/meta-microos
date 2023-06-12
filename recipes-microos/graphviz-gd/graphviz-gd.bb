SUMMARY = "Graphviz plugin for renderers based on gd"
DESCRIPTION = "The graphviz-gd package contains the gd extensions for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gd-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "187cf10bed346c408e86565d42f92b916ec1d15bc9083979901a7e113c211db50d2d0576cede4132f4a5182630d442de7d5d53889a0f980c4a72c203e260b25b"

RPROVIDES:${PN} += "graphviz-gd graphviz-gd(aarch-64) libgvplugin_gd.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcgraph.so.6()(64bit) libgd.so.3()(64bit) libgvc.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpathplan.so.4()(64bit)"

inherit rpm
