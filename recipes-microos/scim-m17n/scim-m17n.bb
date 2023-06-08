SUMMARY = "M17N Input Method Engine for SCIM"
DESCRIPTION = "M17N Input Method Engine for SCIM \
 \
Supports all input methods offered by m17n-lib and m17n-db. \
 \
Currently the following languages are supported: \
 \
Amharic, Arabic, Armenian, Assamese, Bengali, Chinese, Croatian, \
Devanagari, Dhivehi, Farsi, Georgian Greek, Gujarati, Hebrew, Japanese, \
Kannada, Kazakh, Khmer, Korean, Lao, Malayalam, Myanmar, Oriya, \
Punjabi, Russian, Serbian, Sinhala, Slovak, Syriac, Tamil, Telugu, \
Thai, Tibetan, Vietnamese \
 \
Several generic input methods for languages based on the Latin alphabet \
are also included."
LICENSE = "GPL-2.0+"

PV = "0.2.3"

RPM_NAME = "scim-m17n-0.2.3-6.28.aarch64.rpm"
RPM_HASH = "ef75542a48980247611dc74f0105a9ad23371df0187292ddcdc101fc96e1f89c695966ab68adf270437b4d1045fb37d52d724a279658ce9578a95b0980d0eaa1"

RPROVIDES:${PN} += "scim-m17n scim-m17n(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm17n-core.so.0()(64bit) libm17n.so.0()(64bit) libscim-1.0.so.8()(64bit) libscim-1.0.so.8(LIBSCIM_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
