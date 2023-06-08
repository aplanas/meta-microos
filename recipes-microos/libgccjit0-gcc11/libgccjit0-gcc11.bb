SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "libgccjit0-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "e9bd95c5d4218c86b4973c80f0287918926c5092af7942677d39f0dea1fadd9dd885bffc2872437966a851de08322e9d9fc553f1933671e0f8d2b03571efedc7"

RPROVIDES:${PN} += "libgccjit.so.0()(64bit) libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_10)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_12)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_15)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_2)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_3)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_4)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_5)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_6)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_7)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_8)(64bit) libgccjit.so.0(LIBGCCJIT_ABI_9)(64bit) libgccjit0 libgccjit0-gcc11 libgccjit0-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gcc11 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
