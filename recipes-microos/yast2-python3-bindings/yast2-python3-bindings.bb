SUMMARY = "Python3 bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Python language \
and also Python scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-python3-bindings-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "e267ef0543f21c80ff02643a9b30edab3fc0289ee81b7ac0d240a732d38c76a665ad0a96cd77ca825b285315adf534acf44e54a31c87a55b79a7d1aad69ae82d"

RPROVIDES:${PN} += "libpy2lang_python3.so.0()(64bit) yast2-python3-bindings yast2-python3-bindings(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpy2wfm.so.2()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) liby2.so.4()(64bit) liby2util.so.5()(64bit) libycp.so.5()(64bit) libycpvalues.so.6()(64bit) python(abi) python3 yast2-core yast2-ycp-ui-bindings"

inherit rpm
