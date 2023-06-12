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

PV = "14.8"

RPM_NAME = "postgresql14-llvmjit-devel-14.8-1.2.aarch64.rpm"
RPM_HASH = "53af72c03b89b46b7e3297e7b85c30546bee296467ac7ac8338f814cb8d10ee69780c22f2ac8c2d521085ef80be0c97ddc7a0bdddfe59a13e606b5a8f629a95a"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql14-llvmjit-devel \
postgresql14-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql14-llvmjit \
postgresql14-server-devel"

inherit rpm
