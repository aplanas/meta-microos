SUMMARY = "Python bindings for Avogadro libraries"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "python3-avogadro-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "eac88f61057b2e955833fc98b3d375b7bfde6ca8d036c6a761d73bc6f3fc1a9ba3844f86e604c37b590eb852f6c6d6971acc6408d4cf8a542848e3046cf081e4"

RPROVIDES:${PN} += "python3-avogadro python3-avogadro(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAvogadroCore.so.1()(64bit) libAvogadroIO.so.1()(64bit) libAvogadroQuantumIO.so.1()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi)"

inherit rpm
