SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.3"

RPM_NAME = "python39-pykeepass-4.0.3-1.4.noarch.rpm"
RPM_HASH = "d839f1f46e561b6b4e75865c6730b888fccc2198957e610c51de1c74525c8fe19a515f927d8341ced94bc05f6b6143813be6376fcf1d75d499365336934dd9a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pykeepass) python39-pykeepass python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) python39-argon2-cffi python39-construct python39-future python39-lxml python39-pycryptodomex python39-python-dateutil"

inherit rpm
