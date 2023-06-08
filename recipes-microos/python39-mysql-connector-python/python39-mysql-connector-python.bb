SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python39-mysql-connector-python-8.0.19-2.16.noarch.rpm"
RPM_HASH = "941ca412467a4b53a95b9cb18753782a45e5f9326bcccad0d51e8b1337971561e36b7bfa2e4c8cfc932a9c89499149d2278871d20a225fd047ae09839a8334ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mysql-connector-python) python39-mysql-connector-python python3dist(mysql-connector-python)"
RDEPENDS:${PN} += "python(abi) python39-dnspython python39-protobuf"

inherit rpm
