SUMMARY = "Internet Gateway"
DESCRIPTION = "Software to set up a proxy, firewall, and gateway server, including a virtual private network (VPN) gateway."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-gateway_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "7d1fa9630e41a47651c02503c70d3a6c9cf3c0d03620c34088421a766b42f31011ed1c6bb2a7013f6488d6bc7c72edd912fbf907c6326e3bbd3222c5517a1f5a"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-gateway_server patterns-server-gateway_server patterns-server-gateway_server(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
