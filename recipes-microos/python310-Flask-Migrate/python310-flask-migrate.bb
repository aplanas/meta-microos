SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-Flask-Migrate-4.0.0-1.3.noarch.rpm"
RPM_HASH = "ff1cc27c8f1d5bd52c5d16bc4b931d4ff196c7e99954ff4c00dafa8b7f76843ba2dd2b6d4a3a35f553f4be44bb9a9ed40699da4bf77e7fc2f77c07d211a6cf84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Migrate python3.10dist(flask-migrate) python310-Flask-Migrate python3dist(flask-migrate)"
RDEPENDS:${PN} += "python(abi) python310-Flask python310-Flask-SQLAlchemy python310-alembic"

inherit rpm
