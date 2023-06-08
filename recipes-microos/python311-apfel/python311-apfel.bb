SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python311-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "6fd6596441986422ce2de93bd21c8e45cab4f8ae7fbe00cee11dae6d3cfe2604f37f57fbc41bb1d94a4a8b6702da94cc7f30dc3b63d211a06267b2a1b25125b0"

RPROVIDES:${PN} += "python3.11dist(apfel) python311-apfel python311-apfel(aarch-64) python3dist(apfel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAPFEL.so.0()(64bit) libLHAPDF-6.5.4.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi) python311-LHAPDF update-alternatives"

inherit rpm
