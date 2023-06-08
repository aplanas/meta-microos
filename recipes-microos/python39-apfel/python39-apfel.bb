SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python39-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "8c9b8e555125c2cc02e8a06f28dd23dfcbc42a2979754882eb8e287ef97bbb12b5a5a0dc8687aa0a47af7aba38274bf2528cc7f23ae2a20a6b3963d6902ddd09"

RPROVIDES:${PN} += "python3.9dist(apfel) python39-apfel python39-apfel(aarch-64) python3dist(apfel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAPFEL.so.0()(64bit) libLHAPDF-6.5.4.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi) python39-LHAPDF update-alternatives"

inherit rpm
