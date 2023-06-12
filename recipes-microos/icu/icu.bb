SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode and locale \
support, such as calendar, conversions for many character sets, language \
sensitive collation, date and time formatting, support for many locales, \
message catalogs and resources, message formatting, normalization, number and \
currency formatting, time zone support, transliteration, and word, line, and \
sentence breaking. \
 \
This subpackage contains the runtime programs for interacting with ICU."
LICENSE = "ICU"

PV = "73.1"

RPM_NAME = "icu-73.1-1.1.aarch64.rpm"
RPM_HASH = "d32b96c37f2e3159b480c2c54401dfce06226e25a29c2eeacab5855ac4e0e75a5cf4d53807d487d045b5e15339df66165ee7c50472a94162f4410333c14368ab"

RPROVIDES:${PN} += "bundled(timezone) icu icu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.73()(64bit) libicuio.so.73()(64bit) libicutu.so.73()(64bit) libicuuc.so.73()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
