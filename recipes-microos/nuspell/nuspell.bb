SUMMARY = "A spell checker library and command-line tool"
DESCRIPTION = "Nuspell is a spell checker written in C++. It supports languages with \
rich morphology and complex word compounding. \
 \
Main features are: \
 - Full unicode support backed by ICU \
 - Backward compatibility with Hunspell dictionary file format \
 - Twofold affix stripping (for agglutinative languages, like Azeri, \
   Basque, Estonian, Finnish, Hungarian, Turkish, etc.) \
 - Support complex compounds (for example, Hungarian, Germand and Dutch) \
 - Support language specific features (for example, special casing of \
   Azeri and Turkish dotted i, or German sharp s) \
 - Handle conditional affixes, circumfixes, fogemorphemes, forbidden \
   words, pseudoroots and homonyms."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-5.1.2-1.4.aarch64.rpm"
RPM_HASH = "a5166613c76128b41527e592dd8112a12c4ce1812a96cd1c72b7a115a48f8c8c41ec4c3b1a61beeac252269709e8f2e9d739067dca97328b7f629338c0963719"

RPROVIDES:${PN} += "nuspell nuspell(aarch-64)"
RDEPENDS:${PN} += "hunspell ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libnuspell.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
