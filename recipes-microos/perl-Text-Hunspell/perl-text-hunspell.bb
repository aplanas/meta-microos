SUMMARY = "Perl interface to the Hunspell library"
DESCRIPTION = "This module provides a Perl interface to the *Hunspell* library. This \
module is to meet the need of looking up many words, one at a time, in a \
single session, such as spell-checking a document in memory. \
 \
The example code describes the interface on http://hunspell.sf.net"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.16"

RPM_NAME = "perl-Text-Hunspell-2.16-1.3.aarch64.rpm"
RPM_HASH = "e4ad51c1c9f784024c510226aaa5634d6f59b290104306f6f7d473b7f27f1e7807b0932bda07d8dfbecc4d9a38daf8d8cdcbef09ff34d7db20f62dcf2f291d27"

RPROVIDES:${PN} += "perl(Text::Hunspell) perl-Text-Hunspell perl-Text-Hunspell(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhunspell-1.7.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
