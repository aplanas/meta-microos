SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python311-telethon-session-sqlalchemy-0.2.16-1.3.noarch.rpm"
RPM_HASH = "a5defd2f760266ac18fcac5c4547fb9ac562119d62c73ef9b7c04fa82b648fdd157185723be75cd7de0a07d6e83182a992e5478dffb833ae814be6eea9261ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(telethon-session-sqlalchemy) python311-telethon-session-sqlalchemy python3dist(telethon-session-sqlalchemy)"
RDEPENDS:${PN} += "python(abi) python311-SQLAlchemy"

inherit rpm
