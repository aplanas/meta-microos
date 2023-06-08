SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-llvmjit-devel-15.2-3.1.aarch64.rpm"
RPM_HASH = "ad1774e77f265ee2052dce877237c3db05b08c02ddfe4125650be57d530c5afa6a96578235537a640182041b8c4c3c6a8d53acfa8bb914f74a8d143eb0d0126b"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql15-llvmjit-devel postgresql15-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql15-llvmjit postgresql15-server-devel"

inherit rpm
