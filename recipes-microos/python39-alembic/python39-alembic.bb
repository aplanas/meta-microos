SUMMARY = "A database migration tool for SQLAlchemy"
DESCRIPTION = "Alembic is a new database migrations tool, written by the author \
of SQLAlchemy <http://www.sqlalchemy.org>.  A migrations tool \
offers the following functionality: \
 \
* Can emit ALTER statements to a database in order to change \
  the structure of tables and other constructs \
* Provides a system whereby 'migration scripts' may be constructed; \
  each script indicates a particular series of steps that can 'upgrade' a \
  target database to a new version, and optionally a series of steps that can \
  'downgrade' similarly, doing the same steps in reverse. \
* Allows the scripts to execute in some sequential manner."
LICENSE = "MIT"

PV = "1.10.4"

RPM_NAME = "python39-alembic-1.10.4-1.1.noarch.rpm"
RPM_HASH = "2e5293ec5bf8a3e29f2fd862094b4f0a8538d5a141a926f9691abb6f38fc14e2d435eaabbd67acc0d6ea87a90875b18942d7a79ec8a8311849eaa93174ce903a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(alembic) \
python39-alembic \
python3dist(alembic)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Mako \
python39-SQLAlchemy \
python39-python-dateutil \
python39-typing-extensions \
update-alternatives"

inherit rpm
