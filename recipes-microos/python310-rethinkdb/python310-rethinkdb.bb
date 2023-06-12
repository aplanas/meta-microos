SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python310-rethinkdb-2.4.9-1.4.noarch.rpm"
RPM_HASH = "dcbf1bec17271f44f47e19ad06fae287bd5957fedfdc4de50548accf1ca70bcb963677183e0caf9eb8e16348b94a6cb30b03224c1b193e816c8fb8af63510771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rethinkdb \
python3.10dist(rethinkdb) \
python310-rethinkdb \
python3dist(rethinkdb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
