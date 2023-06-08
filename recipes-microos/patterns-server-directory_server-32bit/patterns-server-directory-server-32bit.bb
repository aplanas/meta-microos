SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "The 32bit pattern complementing directory_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-directory_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "0832556e31d3bef821be1d40f6fa54ef88c45ec2612e42fb223d5cdc5bd3b78ce421383279a4a56784e40c444cdf49bf487576c0182ec87192ae74b2d63c27c0"

RPROVIDES:${PN} += "pattern() patterns-server-directory_server-32bit patterns-server-directory_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
