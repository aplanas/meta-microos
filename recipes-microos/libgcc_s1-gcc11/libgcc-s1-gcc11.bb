SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libgcc_s1-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "6324513e5469859ba33ea0da81974831e9052b1147151aac77f307ae82e8f2754dabd71cd1eb44f7fff1d3a7efcedf9c7b3bb5800f71d8d9913650ce77a850a2"

RPROVIDES:${PN} += "libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_11.0)(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_3.4)(64bit) libgcc_s.so.1(GCC_3.4.2)(64bit) libgcc_s.so.1(GCC_3.4.4)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgcc_s.so.1(GCC_4.7.0)(64bit) libgcc_s.so.1(GCC_7.0.0)(64bit) libgcc_s.so.1(GLIBC_2.0)(64bit) libgcc_s1 libgcc_s1-gcc11 libgcc_s1-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
