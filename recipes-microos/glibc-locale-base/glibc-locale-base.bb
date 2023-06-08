SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-locale-base-2.37-3.1.aarch64.rpm"
RPM_HASH = "ffec7cfafff05ebac24f3af6a68094389cf3c00fb2d75afa46d560170ab048feee1b151550bdd52a7924f679cb416fba9f7ea290768dc7ca74909681933dc4b4"

RPROVIDES:${PN} += "glibc-locale-base glibc-locale-base(aarch-64) libCNS.so()(64bit) libGB.so()(64bit) libISOIR165.so()(64bit) libJIS.so()(64bit) libJISX0213.so()(64bit) libKSC.so()(64bit)"
RDEPENDS:${PN} += "/bin/cat /bin/sh glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) ld-linux-aarch64.so.1(GLIBC_PRIVATE)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
