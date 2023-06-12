SUMMARY = "Openmpt's libmodplug"
DESCRIPTION = "The ModPlug mod file playing library (emulated via libopenmpt)."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt_modplug1-0.8.9.0-1.12.aarch64.rpm"
RPM_HASH = "7ddf722fc4846c074cd03ba95fdf6417f10e47e9f9fdc79aa5691e60e13ad182648493da45454e89c4598be5d5db8dee37349d30f8c6190656d9ca11e4b51ec4"

RPROVIDES:${PN} += "libopenmpt_modplug.so.1()(64bit) \
libopenmpt_modplug1 \
libopenmpt_modplug1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenmpt.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
