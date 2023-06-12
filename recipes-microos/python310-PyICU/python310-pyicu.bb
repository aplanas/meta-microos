SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python310-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "a4ec7d01a4b02a48446ecba01a4e39c5729866f4fb81c789c6aca92b31b17e30c6f70e67b92530b9901a7888c7cf707a33471d0084c38d8117797bc8df71d1fa"

RPROVIDES:${PN} += "PyICU \
python3-ICU \
python3-PyICU \
python3.10dist(pyicu) \
python310-ICU \
python310-PyICU \
python310-PyICU(aarch-64) \
python3dist(pyicu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm
