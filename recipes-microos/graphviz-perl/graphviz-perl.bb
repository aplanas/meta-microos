SUMMARY = "Perl extension for Graphviz"
DESCRIPTION = "The graphviz-perl package contains the Perl extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-perl-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "4babc3d7824d2d582a3147c6aeeab83f82a33ba032611f1e293dbc9f12bd1d6cec567f621f6fe63dd518a9cec6fac786af7ccdc9a8ab14c5ce3bec325ef74017"

RPROVIDES:${PN} += "graphviz-perl graphviz-perl(aarch-64) libgv_perl.so()(64bit) perl(gv) perl(gvc)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libperl.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) perl"

inherit rpm
