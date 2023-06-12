SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.4"

RPM_NAME = "python39-pykeepass-4.0.4-1.1.noarch.rpm"
RPM_HASH = "5011a41a23fb9d1de1f8df589a6c15311607fc29f32da78c9f1890d7881d5d9cabff115d22bbff2eb2921061f60c676a8f719510b87cf50a81efe40a771bbbca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pykeepass) \
python39-pykeepass \
python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) \
python39-argon2-cffi \
python39-construct \
python39-future \
python39-lxml \
python39-pycryptodomex \
python39-python-dateutil"

inherit rpm
