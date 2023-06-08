SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-Flask-Migrate-4.0.0-1.3.noarch.rpm"
RPM_HASH = "942c6e895e6436206fdebbc959a68df77879247253ee96781fbdf8092dba9dd9fcd52f98d9da3a94c73783270da002fed639afe356d1cd2b0e76b13603af2951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-migrate) python311-Flask-Migrate python3dist(flask-migrate)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-Flask-SQLAlchemy python311-alembic"

inherit rpm
