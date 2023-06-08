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

PV = "15.2"

RPM_NAME = "postgresql15-llvmjit-15.2-3.1.aarch64.rpm"
RPM_HASH = "8a24e2c66dd27d660acdc50e5ee1f2cbe005eac7c3caec18f1730ccc42111f242d1ae8d060704b4f23ccd9ccf69314057c341e3aebd2577b5baf5f69ac870531"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation postgresql15-llvmjit postgresql15-llvmjit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.15()(64bit) libLLVM.so.15(LLVM_15)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) postgresql-llvmjit-noarch postgresql15-server"

inherit rpm
