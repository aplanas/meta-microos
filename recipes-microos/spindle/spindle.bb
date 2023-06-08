SUMMARY = "Scalable shared library loading in HPC environments"
DESCRIPTION = "Spindle is a tool for improving the performance of dynamic library \
and python loading in HPC environments."
LICENSE = "LGPL-2.1-only"

PV = "0.12.git.4815692"

RPM_NAME = "spindle-0.12.git.4815692-1.11.aarch64.rpm"
RPM_HASH = "6a31f5e6b226a72839d45bbda442336a0fa9bb271b3506e883e97ad1dddb9c813ea7a7f84a688135a1a7332eb049a7ee61b2537e4b916c0336edb46d00790965"

RPROVIDES:${PN} += "libompiintercept.so()(64bit) libprint_ldso_audit.so()(64bit) libspindle.so.0()(64bit) libspindle_audit_pipe.so()(64bit) libspindle_subaudit_pipe.so()(64bit) libspindlebe.so.2()(64bit) libspindlefe.so.2()(64bit) libspindleint.so()(64bit) spindle spindle(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmunge.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
