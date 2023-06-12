SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.38.3"

RPM_NAME = "python310-SQLAlchemy-Utils-0.38.3-1.6.noarch.rpm"
RPM_HASH = "37cfd635ca4d7ed5f04a44d87e869beab67c1fc5df531a4e20ac3516b5b2172838f3ccabe75d8610f7877caf041ff30bef650a855e8ccf985d9341fdc4d0c10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SQLAlchemy-Utils \
python3.10dist(sqlalchemy-utils) \
python310-SQLAlchemy-Utils \
python3dist(sqlalchemy-utils)"
RDEPENDS:${PN} += "python(abi) \
python310-SQLAlchemy"

inherit rpm
