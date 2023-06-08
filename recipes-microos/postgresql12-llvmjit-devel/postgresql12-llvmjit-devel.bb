SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql12-server-devel package."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-llvmjit-devel-12.14-2.1.aarch64.rpm"
RPM_HASH = "e245100c845faf94ac32d8e04c58cae355675274b74d4e76146f905257c424d6355a027f8a44ac02b6314f5d83a406774dbb6078097906e9ee650aefe8359fe5"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql12-llvmjit-devel postgresql12-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql12-llvmjit postgresql12-server-devel"

inherit rpm
