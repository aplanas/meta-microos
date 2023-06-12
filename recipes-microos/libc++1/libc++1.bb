SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libc++1-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "f2c1972ed680a3f506e887f35948302293446646c9b4ac6065c4206b495b796c72a7571a62544047497c0ee3153ee91dba3a23b407fb4d6bff8a7c21a472927f"

RPROVIDES:${PN} += "libc++.so.1()(64bit) \
libc++1 \
libc++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc++abi.so.1()(64bit) \
libc++abi1 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
