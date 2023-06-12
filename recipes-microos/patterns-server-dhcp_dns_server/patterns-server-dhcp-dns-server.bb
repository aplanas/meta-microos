SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "Software to set up a server for the Dynamic Host Configuration Protocol (DHCP) and the Domain Name System (DNS) services. DHCP provides configuration parameters to client computers to integrate them into a network, whereas DNS delivers information associated with domain names, in particular, the IP address."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-dhcp_dns_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "7bfcd12059cdc2641ef7e4f82589e5d528cb21d4176a953d3506937e40968105eab88c7c9356ad16c4c05532b569a0665d4a2fb2e87f3ad63990c0eef7c0087a"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-dhcp_dns_server patterns-server-dhcp_dns_server patterns-server-dhcp_dns_server(aarch-64)"
RDEPENDS:${PN} += "bind dhcp-server pattern()"

inherit rpm
