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

RPM_NAME = "python311-SQLAlchemy1-1.4.46-3.1.aarch64.rpm"
RPM_HASH = "f4c0fe4901566303ff9e66432a80a62fef3ee49b40c34026cf0bb3ccda3cb6f7578ad0eca4afa5d7aa63023b0ac09887e24be006702fa29978d2e605e33fcadc"

RPROVIDES:${PN} += "python3.11dist(sqlalchemy) \
python311-SQLAlchemy \
python311-SQLAlchemy1 \
python311-SQLAlchemy1(aarch-64) \
python311-sqlalchemy \
python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311 \
python311-greenlet"

inherit rpm
