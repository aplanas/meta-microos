SUMMARY = "Multi-purpose desktop calculator application"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry (although it supports optional traditional buttons). \
This is the commandline interface, named qalc."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "6ce4810f3a94ee557dcd99bdf36684120c24e416dcee054563e493a5540ebd367b045e69792681948c3cc1148702b7d218dd93b35a520953c20e5da8bc44aea6"

RPROVIDES:${PN} += "qalculate \
qalculate(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqalculate.so.22()(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
qalculate-data"

inherit rpm
