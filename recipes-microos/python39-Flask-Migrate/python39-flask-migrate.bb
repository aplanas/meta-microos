SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-Flask-Migrate-4.0.0-1.3.noarch.rpm"
RPM_HASH = "0c1ee17d0d4698730101122f6118f115608c14b62caea97129a3b4d60d47dd3a7ac44b9be40deed51276c4b1ce80e96650d7f783181385008829417f59478e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-migrate) python39-Flask-Migrate python3dist(flask-migrate)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-Flask-SQLAlchemy python39-alembic"

inherit rpm
