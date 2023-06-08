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

PV = "13.10"

RPM_NAME = "postgresql13-llvmjit-devel-13.10-2.1.aarch64.rpm"
RPM_HASH = "ce1ab5b42abed857178bb875ccc719ddb8f2ef9ec3be9334cf55724f366e33ed012e862fbce3a7aa93adc36349b01266cda1d69e739f8dbc031f7bc1fa551b4e"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-implementation postgresql13-llvmjit-devel postgresql13-llvmjit-devel(aarch-64)"
RDEPENDS:${PN} += "clang15 llvm15 postgresql-llvmjit-devel-noarch postgresql13-llvmjit postgresql13-server-devel"

inherit rpm
