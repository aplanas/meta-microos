SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python39-rethinkdb-2.4.9-1.4.noarch.rpm"
RPM_HASH = "54ea667ff2a71a62df11dfde0ad6bff3162f8dbdbf73359ad47b56d5769ef2538d26aa4ea22eaab5ab75d17345c3de6ec94ab01a8fe27afa23715097c56b339a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rethinkdb) \
python39-rethinkdb \
python3dist(rethinkdb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-six \
update-alternatives"

inherit rpm
