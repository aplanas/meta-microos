SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python310-transip-2.1.2-4.6.noarch.rpm"
RPM_HASH = "12f1f19c7f51d76c19a3b21e7779817949d4e42b44f0c677405b3bd1bceda043cdf33663f8eb5ba95662a03a26341961bf97ef70653c35c0eca274b5c46da9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transip \
python3.10dist(transip) \
python310-transip \
python3dist(transip)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-cryptography \
python310-requests \
python310-setuptools \
python310-suds \
update-alternatives"

inherit rpm
