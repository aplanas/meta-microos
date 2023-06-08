SUMMARY = "Performance Co-Pilot (PCP) test suite"
DESCRIPTION = "Quality assurance test suite for Performance Co-Pilot (PCP)."
LICENSE = "GPL-2.0+ & MIT"

PV = "5.2.5"

RPM_NAME = "pcp-testsuite-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b063f85d4bcda2ca9aff09b39fb26e3a28f3558e7815d2236eee7866da65b595a6b15ad0a32bbac6df80ea6f02bc14cd1b1a8109c3c1f0cd9328a1c72a1b1d9f"

RPROVIDES:${PN} += "pcp-testsuite pcp-testsuite(aarch-64) perl(Slurm) perl(Slurm::Hostlist)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.21)(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp_pmda.so.3()(64bit) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) pcp pcp-devel"

inherit rpm
