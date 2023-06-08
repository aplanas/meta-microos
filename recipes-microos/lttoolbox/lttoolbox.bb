SUMMARY = "Toolbox for lexical processing and morphological analysis"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
The package provides three programs, lt-comp, the compiler, \
lt-proc, the processor, and lt-expand, which generates all possible \
mappings between surface forms and lexical forms in the dictionary."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.1"

RPM_NAME = "lttoolbox-3.7.1-1.4.aarch64.rpm"
RPM_HASH = "8d789e00d3437116791c45276bd7aa592001d533eff2281cf826006091c43abbcbcf58cde6f999cddffb8dcef28c2b109fd023b47561f7a01b0fa52125095ae7"

RPROVIDES:${PN} += "lttoolbox lttoolbox(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuio.so.72()(64bit) liblttoolbox.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
