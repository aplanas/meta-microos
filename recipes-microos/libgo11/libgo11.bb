SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "7.5.0+r278197"

RPM_NAME = "libgo11-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "7c4781491d56bb58a965bd6bab161d9cd0cfedcd48dcbe25521d98a6135429f37dfa13f875937bd209abb3726b5fe19f69024e92d53948475578efb36d798bcb"

RPROVIDES:${PN} += "libgo.so.11()(64bit) libgo11 libgo11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
