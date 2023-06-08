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

PV = "72.1"

RPM_NAME = "icu-72.1-2.3.aarch64.rpm"
RPM_HASH = "242c7dfdc19e9e50a3072ecd3bf67292792eb0153ca60135a4f64f9b2563134d77538c2f07aeeac4f88e254bc52091898c70fb98d7842576250904c3237ed21f"

RPROVIDES:${PN} += "bundled(timezone) icu icu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuio.so.72()(64bit) libicutu.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
