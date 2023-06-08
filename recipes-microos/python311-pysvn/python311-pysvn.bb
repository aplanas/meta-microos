SUMMARY = "Highlevel Subversion Python Bindings"
DESCRIPTION = "pysvn is a set of highlevel Python bindings to Subversion. pysvn \
enables tools to be written in Python that use Subversion. \
 \
Features: \
 * Supports all svn client features \
 * Supports svn transaction features required to write svn pre-commit \
   hooks \
 * Python like interface \
 * Documentation and examples provided \
 * No need to understand the Subversion C API"
LICENSE = "Apache-1.1"

PV = "1.9.20"

RPM_NAME = "python311-pysvn-1.9.20-1.6.aarch64.rpm"
RPM_HASH = "dd92a2763ba2b31b2a69ab6474332dcc194779f844055919a97d314164d15bd7d317d2f898263b16fba4bcb730901c9620f792b7ac585daffbbde2c9fdda18ca"

RPROVIDES:${PN} += "python311-pysvn python311-pysvn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-1.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libsvn_client-1.so.0()(64bit) libsvn_diff-1.so.0()(64bit) libsvn_fs-1.so.0()(64bit) libsvn_repos-1.so.0()(64bit) libsvn_subr-1.so.0()(64bit) libsvn_wc-1.so.0()(64bit) neon python(abi) subversion"

inherit rpm
