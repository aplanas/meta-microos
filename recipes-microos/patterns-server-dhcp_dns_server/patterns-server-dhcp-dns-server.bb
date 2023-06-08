SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "Software to set up a server for the Dynamic Host Configuration Protocol (DHCP) and the Domain Name System (DNS) services. DHCP provides configuration parameters to client computers to integrate them into a network, whereas DNS delivers information associated with domain names, in particular, the IP address."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-dhcp_dns_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "8e742aad6e8097d63462b5f760a2fc2768980eb98c3a0e0d99661b31455bc31ac0c28e034f32653d402cd4fb7e1a22cea0145cc9739e7012056780cfdab1247d"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-dhcp_dns_server patterns-server-dhcp_dns_server patterns-server-dhcp_dns_server(aarch-64)"
RDEPENDS:${PN} += "bind dhcp-server pattern()"

inherit rpm
