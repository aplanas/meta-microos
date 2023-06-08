SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "libgccjit0-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "b1427db3c02af6ed8ad97f942343075b1e7ba332745b02e603e0b75bc283aca28bb8de9b29c8c86a673bb0e0d2a4ff0f2cde8be426b1566f27f5cba637b1800f"

RPROVIDES:${PN} += "libgccjit.so.0()(64bit) libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_10)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_12)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_15)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_16)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_17)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_18)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_19)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_2)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_20)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_21)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_22)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_23)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_24)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_3)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_4)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_5)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_6)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_7)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_8)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_9)(64bit) libgccjit0 libgccjit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
