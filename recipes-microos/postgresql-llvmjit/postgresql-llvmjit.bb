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

PV = "15"

RPM_NAME = "postgresql-llvmjit-15-2.4.noarch.rpm"
RPM_HASH = "764a5007780bcf031f134f0167514a67f645783a16cd12704306fa5a3cb908aa093750a7b95f54fb81efe2d24aa6b0a4f54810fdb686775e0e9038e26b017eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit postgresql-llvmjit-noarch"
RDEPENDS:${PN} += "postgresql-llvmjit-implementation"

inherit rpm
