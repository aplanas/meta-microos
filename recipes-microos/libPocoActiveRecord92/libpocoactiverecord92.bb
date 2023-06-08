SUMMARY = "POCO C++ Active Record"
DESCRIPTION = "ActiveRecord is a simple and lightweight object-relational mapping (ORM) \
framework based on the Active Record pattern and the Data library."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoActiveRecord92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "65141c1e038f2e1e50aa75e52ab94dfcc0352d6d6e41c05846d2555b6832265ccb834ba69e991fef4bf865b7f798a6b39a5771f71738e04d7d48c02d42787b27"

RPROVIDES:${PN} += "libPocoActiveRecord.so.92()(64bit) libPocoActiveRecord92 libPocoActiveRecord92(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libPocoData.so.92()(64bit) libPocoFoundation.so.92()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
