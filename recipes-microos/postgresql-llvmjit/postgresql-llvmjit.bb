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

RPM_NAME = "postgresql-llvmjit-15-2.7.noarch.rpm"
RPM_HASH = "1759d801e6fbd6d638830fc7713fb3ff1c445d61ff7179979339a6538c562ef1fcb35ff78e0b29bb2f00a00fcd228dcfa9c79d554298589a49db061d3fc7e9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit postgresql-llvmjit-noarch"
RDEPENDS:${PN} += "postgresql-llvmjit-implementation"

inherit rpm
