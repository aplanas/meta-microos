SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.4"

RPM_NAME = "python311-pykeepass-4.0.4-1.1.noarch.rpm"
RPM_HASH = "95f4c8ccf21370f9cde6b9e041025e8212be1e5d62eb58b6730b2b092e88635b6f5a8a14b550f0c2f6b051fa8207a4a612896cb50c26281bea569fc19a6fb7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pykeepass) python311-pykeepass python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) python311-argon2-cffi python311-construct python311-future python311-lxml python311-pycryptodomex python311-python-dateutil"

inherit rpm
