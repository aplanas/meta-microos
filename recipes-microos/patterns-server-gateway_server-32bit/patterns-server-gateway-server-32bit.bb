SUMMARY = "Internet Gateway"
DESCRIPTION = "The 32bit pattern complementing gateway_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-gateway_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "4dcdcf4feba0e5d6033ee216670844d1394a8f38139d1a8bf3dcc7f0e0313a08f6a7480d6e770c674c70b7b81bb3acc8fa3e4577a2b4abd3112c80fd7b9722fe"

RPROVIDES:${PN} += "pattern() patterns-server-gateway_server-32bit patterns-server-gateway_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
