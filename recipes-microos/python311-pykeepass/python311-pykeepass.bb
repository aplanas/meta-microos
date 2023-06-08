SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.3"

RPM_NAME = "python311-pykeepass-4.0.3-1.4.noarch.rpm"
RPM_HASH = "ef355d7c0077e553d5b20d5c1dd0d62c75e9ddfb56f121507d4f6bd790f192ede7056ad07021f53e5f93b731f5cf7287bd6743c0a567d0a8ac50614ed480ef86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pykeepass) python311-pykeepass python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) python311-argon2-cffi python311-construct python311-future python311-lxml python311-pycryptodomex python311-python-dateutil"

inherit rpm
