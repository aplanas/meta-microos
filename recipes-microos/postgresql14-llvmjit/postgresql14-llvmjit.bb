SUMMARY = "Just-in-time compilation support for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-llvmjit-14.7-2.1.aarch64.rpm"
RPM_HASH = "95248dc793efc8b7691fc62223ff1b17986309c9b5b6a6f3e06e9e2fa52f52f97c6e740b4cd2ea17e38f75a589485d5cb82a0096ab3711f5d68a1df5d87f0124"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation postgresql14-llvmjit postgresql14-llvmjit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.15()(64bit) libLLVM.so.15(LLVM_15)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) postgresql-llvmjit-noarch postgresql14-server"

inherit rpm
