SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-ruby-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "3b8ac32ab69ddd00a23a9827dcd4143911ce41ec62ae43a1631ce059823f3c3ed305030eef4ba01098c1e927517ea61900603de8ee34ab02124d88dd2e9d9cf9"

RPROVIDES:${PN} += "graphviz-ruby graphviz-ruby(aarch-64) libgv_ruby.so()(64bit)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ruby"

inherit rpm
