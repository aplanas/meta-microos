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

RPM_NAME = "postgresql-llvmjit-devel-15-2.7.noarch.rpm"
RPM_HASH = "49b429336551108fa75bffa22685f41da424ee0696752493493f13826051ca1af31f058756e664f1d7586cceaea9b1b1a28bc58ecc2216ecc8ff36044aa37f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-noarch"
RDEPENDS:${PN} += "postgresql-llvmjit-devel-implementation \
postgresql-server-devel-noarch"

inherit rpm
