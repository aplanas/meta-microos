SUMMARY = "Calulator Library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This is the shared library package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "libqalculate22-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "bb30bdaec4ab710bb127c4dd2e451cfadc7a2a53f727bd3ef86b10509855f241d3813df600256cd07e00214d1296c1405eb2fd1e83a9ced9b5f138d996c5d871"

RPROVIDES:${PN} += "libqalculate libqalculate.so.22()(64bit) libqalculate22 libqalculate22(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
