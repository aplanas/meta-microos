SUMMARY = "An RDS decoder"
DESCRIPTION = "redsea is a command-line RDS (Radio Data System) decoder. \
It can be used with any RTL-SDR USB radio stick with the rtl_fm tool. \
It can also decode the raw ASCII bitstream, the hex format used by RDS Spy, \
and audio files containing multiplex signals (MPX). \
 \
RDS groups are printed to the terminal as line-delimited JSON objects \
or, optionally, undecoded hex blocks (-x)."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "redsea-0.20-1.9.aarch64.rpm"
RPM_HASH = "a01937cced2952ffca73dc74051a381101235f60c05c8a33cd2dce6aae94ceb95b162388824f92d95a23ef57647366acec93d4442e7966421bbc357c0cf40853"

RPROVIDES:${PN} += "redsea redsea(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libliquid.so()(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
