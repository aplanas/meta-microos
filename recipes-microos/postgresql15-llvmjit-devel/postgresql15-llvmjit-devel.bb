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

PV = "15.3"

RPM_NAME = "postgresql15-llvmjit-devel-15.3-1.2.aarch64.rpm"
RPM_HASH = "3fc294937e4a9277703fbcc053c54cb173f52637d6150cde09507e7598ebe925b5daee94d99f65b778a4dbd1e254904818ca139cfb08d60dd897067818222793"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql15-llvmjit-devel \
postgresql15-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql15-llvmjit \
postgresql15-server-devel"

inherit rpm
