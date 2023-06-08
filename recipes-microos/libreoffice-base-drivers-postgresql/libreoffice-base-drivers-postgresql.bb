SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "1736c7e2104dd10db0b3aadf98c667864690b354b81f5a9970ab85b9b1d49ea3e7738a5128ac6afd75c6873a875f8ce2d8920665cb6dcf11829332a4c98a0c36"

RPROVIDES:${PN} += "libpostgresql-sdbc-impllo.so()(64bit) libpostgresql-sdbclo.so()(64bit) libreoffice-base-drivers-postgresql libreoffice-base-drivers-postgresql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libmergedlo.so()(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libuno_cppu.so.3()(64bit) libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) libuno_cppu.so.3(UDK_3.1)(64bit) libuno_cppu.so.3(UDK_3_0_0)(64bit) libuno_cppuhelpergcc3.so.3()(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.1)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.3)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_3.5)(64bit) libuno_sal.so.3(LIBO_UDK_3.6)(64bit) libuno_sal.so.3(LIBO_UDK_4.0)(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(LIBO_UDK_5.1)(64bit) libuno_sal.so.3(PRIVATE_1.6)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.6)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) libuno_salhelpergcc3.so.3()(64bit) libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) postgresql rtld(GNU_HASH)"

inherit rpm
