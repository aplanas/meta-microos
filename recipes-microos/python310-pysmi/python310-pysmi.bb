SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python310-pysmi-0.3.4-3.9.noarch.rpm"
RPM_HASH = "bf1f3d207e7c4ed8b12ad9c13b1467c0a3cfa0bed34841275e947348efd27f56a5f79b1548688bb592c8c9e489850412d42f9b31bb26139733780176e4c73e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmi python3.10dist(pysmi) python310-pysmi python3dist(pysmi)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-ply"

inherit rpm
