SUMMARY = "Intelligent predictive text entry platform (tools and demos)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the tools required to generate custom statistical data used by the presage predictive text engine to generate predictions. \
 \
This package also contains simple demonstration programs and simulator."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-0.9.1-12.10.aarch64.rpm"
RPM_HASH = "a8b0ad768d8f15a9b86bffdb13f8ee48fdd1384fa9bf0431c4b244cffeecb9e2b15452d078f4f61e0d9b965afa70ea516b6e64939c27d264d72d9b58661f12b9"

RPROVIDES:${PN} += "presage presage(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libpresage.so.1()(64bit) libpresage.so.1(PRESAGE_0.8.3)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
