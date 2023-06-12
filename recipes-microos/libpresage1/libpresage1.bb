SUMMARY = "Intelligent predictive text entry platform (shared library)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
A predictive text entry system attempts to improve the ease and speed of textual input by predicting words. Word prediction consists in computing which word tokens or word completions are most likely to be entered next. The system analyses the text already entered and combines the information thus extracted with other information sources to calculate the set of most probable tokens. \
 \
Presage exploits redundant information embedded in natural languages to generate word predictions. The modular architecture allows its language model to be extended and customized to utilize statistical, syntactic, and semantic information sources. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage1-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "9d3fc68ee71e675d4c36a60d449dbe7f71e59679a5b563de6100c6fb4babc36e0653b3e2c1c71737b48b8394985a155d0670b5d18f5cea8ded9f1cf6a064109e"

RPROVIDES:${PN} += "libpresage.so.1()(64bit) libpresage.so.1(PRESAGE_0.8.3)(64bit) libpresage.so.1(PRESAGE_0.8.5)(64bit) libpresage.so.1(PRESAGE_0.9.1)(64bit) libpresage1 libpresage1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) presage-data"

inherit rpm
