SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python39-agate-sql-0.5.9-1.4.noarch.rpm"
RPM_HASH = "496e227e424be58932bfce37328433b6a05ab514ff1ba5f644d69b8cf82ec6c816fcfecff5052d81157ea492434319767b059cb75ace0092114ed56061d2b2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-sql) python39-agate-sql python3dist(agate-sql)"
RDEPENDS:${PN} += "(python39-SQLAlchemy >= 1.0.8 with python39-SQLAlchemy < 2) python(abi) python39-agate"

inherit rpm
