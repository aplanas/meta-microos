SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql11-server-devel package."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-llvmjit-devel-11.20-1.2.aarch64.rpm"
RPM_HASH = "6306edd5b9b470efa13f0d01ee88cec04d7eda03564eb6862c0a75ff6d50ceaff3956fe93adc6a4f10c512e508da48f4e4e97a5865484a10225cb08977685106"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql11-llvmjit-devel postgresql11-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql11-llvmjit postgresql11-server-devel"

inherit rpm
