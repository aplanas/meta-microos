SUMMARY = "Command line time tracker"
DESCRIPTION = "Timewarrior is a command line time tracking application, which allows you to \
record time spent on activities."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "timewarrior-1.4.2-1.11.aarch64.rpm"
RPM_HASH = "0e3071c7bfa43974bafb1c31fda4d2d04b4537f02dbedbcfc2fc042800c250cc485cf440499810f05f4876d2184623d97f9723ddca82aa3ec03a55a605676cac"

RPROVIDES:${PN} += "timewarrior timewarrior(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
