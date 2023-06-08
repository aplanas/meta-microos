SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python39-telethon-session-sqlalchemy-0.2.16-1.3.noarch.rpm"
RPM_HASH = "9f58f9241d0babbdbba69ced69f2f7d38ea56310bc0befb527be4b663b9b994fe41503a2311132d36a9f09a56f921ae21d778fbfab342cc098122f7c6dd00bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(telethon-session-sqlalchemy) python39-telethon-session-sqlalchemy python3dist(telethon-session-sqlalchemy)"
RDEPENDS:${PN} += "python(abi) python39-SQLAlchemy"

inherit rpm
