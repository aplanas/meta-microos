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

PV = "11.19"

RPM_NAME = "postgresql11-llvmjit-devel-11.19-2.1.aarch64.rpm"
RPM_HASH = "d2d79979751497a0df4547b1ec1ecf098c732603af7ca2055369529fb72937106a02404f66be02ea8b3f61663febabd1e92fabf6f20ea3ccaefae29dc5cd4c38"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql11-llvmjit-devel postgresql11-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql11-llvmjit postgresql11-server-devel"

inherit rpm
