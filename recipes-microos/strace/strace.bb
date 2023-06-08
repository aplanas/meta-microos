SUMMARY = "A utility to trace the system calls of a program"
DESCRIPTION = "With strace, you can trace the activity of a program.  Information \
about any system calls the program makes and the signals it receives \
and processes can be seen.  Child processes can also be tracked."
LICENSE = "BSD-3-Clause"

PV = "6.3"

RPM_NAME = "strace-6.3-1.1.aarch64.rpm"
RPM_HASH = "f4a1630c10afe40279ac3d1cbd3f636185498c6b107d9242b6de6115104b76829ac9c403076e3774696da3285b1175c91fc2e4ef1c515cefe451dd04ef299f84"

RPROVIDES:${PN} += "strace strace(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libdw.so.1(ELFUTILS_0.158)(64bit)"

inherit rpm
