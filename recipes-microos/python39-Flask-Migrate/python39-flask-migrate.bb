SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python39-Flask-Migrate-4.0.4-1.1.noarch.rpm"
RPM_HASH = "d728151a25f04fd7d5f4469dbbb6729cc16aafb9ccef71a48af45aab296726da57c73582a86ea8086a20831615fc6961e7d022d0a8ac89be49c9fea06bbcebcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-migrate) python39-Flask-Migrate python3dist(flask-migrate)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-Flask-SQLAlchemy python39-alembic"

inherit rpm
