SUMMARY = "LSC Algorithm Burst Library"
DESCRIPTION = "The LSC Algorithm Burst Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "python39-lalburst-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "5bb1ec540a44249ffd915af1d9409966394287ea040b4435a41711914e319b557fefbb370c595f854b884662c3536f400be8eae39d3a40b6b1549f741a9515f3"

RPROVIDES:${PN} += "python39-lalburst python39-lalburst(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgsl.so.25()(64bit) liblal.so.20()(64bit) liblalburst.so.6()(64bit) liblalsupport.so.14()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) python(abi) python39-glue python39-lal python39-lalmetaio python39-lalsimulation python39-ligo-lw python39-numpy python39-scipy"

inherit rpm
