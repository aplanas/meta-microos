SUMMARY = "A pure-Python SNMPv1/v2c/v3 library"
DESCRIPTION = "This project is a SNMP v1/v2c/v3 engine written in the Python \
programming language. \
 \
    * Complete SNMPv1/v2c and SNMPv3 engine support \
    * Can act as Manager and/or Agent \
    * Manager and Agent side MIB support \
    * Asynchronous operations support \
    * Pure-Python implementation \
    * py2exe and .egg friendly \
    * Twisted binding"
LICENSE = "BSD-2-Clause"

PV = "4.4.12"

RPM_NAME = "python310-pysnmp-4.4.12-2.13.noarch.rpm"
RPM_HASH = "49ddb172aa199eb0ba9abe6509e65f1b2195497eb2570eac7935690a98731f13ad5c3329c1aa7e57ee18f8cfae9914c615af8145b905596291073e0a6536d437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmp python3.10dist(pysnmp) python310-pysnmp python3dist(pysnmp)"
RDEPENDS:${PN} += "python(abi) python310-pyasn1 python310-pycryptodome python310-pysmi"

inherit rpm
