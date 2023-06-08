SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-test-15-2.4.noarch.rpm"
RPM_HASH = "b86e322d45a88f4ab0bc8c917b024b3ba52757665019a7fb4eacfd9761c3778ec3ab4d7657cf34d163ddf71f29e6f27fa30c494d397aa7c78056e629e4a929d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-test postgresql-test-noarch"
RDEPENDS:${PN} += "postgresql-test-implementation"

inherit rpm
