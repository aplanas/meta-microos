SUMMARY = "Bindings for the Boost Geometry library"
DESCRIPTION = "Bindings for the Boost Geometry library"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Boost-Geometry-Utils-0.15-4.37.aarch64.rpm"
RPM_HASH = "15dbfd44911aa8c7eee9eaf5ce987786d868cd3e8dd243069d80a1c00e5b327dc33f3af25016e732c2a6373ea63cf9925b928a4d1cec7c45d8a763d488c3f644"

RPROVIDES:${PN} += "perl(Boost::Geometry::Utils) perl-Boost-Geometry-Utils perl-Boost-Geometry-Utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
