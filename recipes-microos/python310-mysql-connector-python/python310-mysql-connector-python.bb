SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python310-mysql-connector-python-8.0.19-2.16.noarch.rpm"
RPM_HASH = "d6f70fbeeae2f283ca8d7efea9ae1cb9415b6d1b477366e68fbb50e7caf34c25516b48d072d48488c320158a42cfb8428bfd8141a6d69fdeba93a49bcbbe5942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mysql-connector-python python3.10dist(mysql-connector-python) python310-mysql-connector-python python3dist(mysql-connector-python)"
RDEPENDS:${PN} += "python(abi) python310-dnspython python310-protobuf"

inherit rpm
