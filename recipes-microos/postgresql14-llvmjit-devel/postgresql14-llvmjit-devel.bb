SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-llvmjit-devel-14.7-2.1.aarch64.rpm"
RPM_HASH = "11603c9cbd7098977243a251894170595ba234bfecb40b3bccbe7ed5b2eb1a3ab0bcef40eb8cfed9379a2d07d82a84dfe8141acca7a14f83b3516e7ee914157c"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql14-llvmjit-devel postgresql14-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql14-llvmjit postgresql14-server-devel"

inherit rpm
