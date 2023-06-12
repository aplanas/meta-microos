SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql13-server-devel package."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-llvmjit-devel-13.11-1.2.aarch64.rpm"
RPM_HASH = "042b798d325589bd54a76906f0acd24c1f4c8b0007f280e7ccbea9b198eab17ff270682ae2bafed1bc10d45ba90298035361a03034c10ccd6208557827603be7"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql13-llvmjit-devel \
postgresql13-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql13-llvmjit \
postgresql13-server-devel"

inherit rpm
