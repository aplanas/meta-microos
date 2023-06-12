SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "The 32bit pattern complementing dhcp_dns_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-dhcp_dns_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "51fcb8a8cb59ec2af4787dc2d0365d7cd4dc2237bde923ddf676f0da920c481e41800c85e5a6f26eb7bd83653616ad8c9d4a062c977ba47a37efd53f5f769e79"

RPROVIDES:${PN} += "pattern() patterns-server-dhcp_dns_server-32bit patterns-server-dhcp_dns_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
