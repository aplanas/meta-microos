SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python311-mysql-connector-python-8.0.19-2.16.noarch.rpm"
RPM_HASH = "572f8728aa3e86e93fec35e94cd834a8ee63265f7a0b1121b6c4951879379ebf78be90b8bd9144835140dc344613e85cd9add2d3cfb5551cf810ec2c6445be5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mysql-connector-python) python311-mysql-connector-python python3dist(mysql-connector-python)"
RDEPENDS:${PN} += "python(abi) python311-dnspython python311-protobuf"

inherit rpm
