SUMMARY = "Helper package to pull all dependencies to build with llvm support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package will pull all the dependencies to build extensions with llvm \
support if the base distro has llvm enabled. \
 \
Otherwise it will just pull the postgresqlXY-server-devel package"
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-llvmjit-devel-15-2.4.noarch.rpm"
RPM_HASH = "b5dad9c5d9512fa518388430c07cabca95a45981a5ada360fdf0a6884730ed2e98ce773039ea4c58ebe85d8fe0bb55b2aa22833cf109a58d1e7bfd31dd070d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit-devel postgresql-llvmjit-devel-noarch"
RDEPENDS:${PN} += "postgresql-llvmjit-devel-implementation postgresql-server-devel-noarch"

inherit rpm
