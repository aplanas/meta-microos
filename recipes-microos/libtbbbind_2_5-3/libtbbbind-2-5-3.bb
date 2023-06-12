SUMMARY = "Threading Building Blocks (TBB) NUMA support library"
DESCRIPTION = "The NUMA support library for Threading Building Blocks (TBB)"
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "libtbbbind_2_5-3-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "fa9590a01f4e967948974d33d164e591cc262d1f05909b59b7502cafcc030d5d5ad5ef21a031fc8b82c592390306ea413fc0c7a015235621596429a6663780f7"

RPROVIDES:${PN} += "libtbbbind_2_5-3 \
libtbbbind_2_5-3(aarch-64) \
libtbbbind_2_5.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhwloc.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
