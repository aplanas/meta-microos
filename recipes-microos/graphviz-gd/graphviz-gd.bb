SUMMARY = "Graphviz plugin for renderers based on gd"
DESCRIPTION = "The graphviz-gd package contains the gd extensions for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gd-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "b7b2cac3ebd333cffe4dc5ab47fda0796c9562a661b7f81ccbb1ad4503cce8d59a7254e32f9ffd9f671215c4409bb3b45f8b4b9373274217ac17c842f443ea4f"

RPROVIDES:${PN} += "graphviz-gd graphviz-gd(aarch-64) libgvplugin_gd.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcgraph.so.6()(64bit) libgd.so.3()(64bit) libgvc.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpathplan.so.4()(64bit)"

inherit rpm
