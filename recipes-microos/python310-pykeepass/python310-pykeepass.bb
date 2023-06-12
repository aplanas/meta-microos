SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.4"

RPM_NAME = "python310-pykeepass-4.0.4-1.1.noarch.rpm"
RPM_HASH = "707fde9295ef9cbd3b51aa2913bb6ac3d124c6a20dcfafc76404a3b454d5b906944fcbf7574b9eb64cdcca8713aaa8bf0eefa7f8748230ba08090956cfdacf3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykeepass \
python3.10dist(pykeepass) \
python310-pykeepass \
python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) \
python310-argon2-cffi \
python310-construct \
python310-future \
python310-lxml \
python310-pycryptodomex \
python310-python-dateutil"

inherit rpm
