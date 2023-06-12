SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libgccjit0-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "c5b1cfe972f144bdcbb2324c01ad46987f77369a0632a2674d26af078cb8ef098c0e9bd1e720f1fc305cd05393c490f6783afdf33783813874d49780266280c3"

RPROVIDES:${PN} += "libgccjit.so.0()(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_10)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_12)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_15)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_16)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_17)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_18)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_19)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_2)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_20)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_21)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_22)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_23)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_24)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_3)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_4)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_5)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_6)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_7)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_8)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_9)(64bit) \
libgccjit0 \
libgccjit0-gcc12 \
libgccjit0-gcc12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gcc12 \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
