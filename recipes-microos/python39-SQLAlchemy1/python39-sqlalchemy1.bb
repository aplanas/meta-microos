SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python39-SQLAlchemy1-1.4.46-2.1.aarch64.rpm"
RPM_HASH = "9a7846a6f444e298689828c73f2e162d4f7d6ef3462452e97e927054244293d796f3a95a7bd3ce847b12623b8d05f52c281a3c627933d8b7970b7ba1c86bbf75"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy) python39-SQLAlchemy1 python39-SQLAlchemy1(aarch-64) python39-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39 python39-greenlet"

inherit rpm
