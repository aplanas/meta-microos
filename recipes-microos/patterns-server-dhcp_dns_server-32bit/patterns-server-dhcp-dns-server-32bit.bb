SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "The 32bit pattern complementing dhcp_dns_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-dhcp_dns_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "991b48a30d6d42a564fabf090a32b91f82c16ccf14c6d715993ca686db00c779a117b7c63d6fdeaf8e0d33c4274a8aad3bb1329c00128127b53232228d6a3780"

RPROVIDES:${PN} += "pattern() patterns-server-dhcp_dns_server-32bit patterns-server-dhcp_dns_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
