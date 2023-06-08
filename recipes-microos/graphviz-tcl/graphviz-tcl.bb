SUMMARY = "Tcl extension tools for graphviz"
DESCRIPTION = "The graphviz-tcl package contains the various tcl packages (extensions) \
for the graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-tcl-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "f6d11ff8f58a1c6b6743f6711cea3aa93d35c275aa0d42e2acf50a19d6c0956dd89f0422f5025dd82033ed295a08be5f15ea60006d31426835b6e70025a6220f"

RPROVIDES:${PN} += "graphviz-tcl graphviz-tcl(aarch-64) libgdtclft.so.0()(64bit) libgv_tcl.so()(64bit) libtcldot.so.0()(64bit) libtcldot_builtin.so.0()(64bit) libtclplan.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcgraph.so.6()(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgd.so.3()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgts-0.7.so.5()(64bit) libgvc.so.6()(64bit) libltdl.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpathplan.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) tcl tk"

inherit rpm
