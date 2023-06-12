SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-ruby-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "a8a7c169a1782d4aeda423b920da0fffa0e70a7491e51b03ad0f11cdf30a88e9872226526054b4d0c4359b1474328a8f7758f5b9ded4e9782696b08d4d100b1d"

RPROVIDES:${PN} += "graphviz-ruby graphviz-ruby(aarch-64) libgv_ruby.so()(64bit)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ruby"

inherit rpm
