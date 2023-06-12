SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-isc_dhcp_leases-0.9.1-3.3.noarch.rpm"
RPM_HASH = "9795433ba265cfe0f3880816b087a0739110212c2a7cdbc355453e87955b50212c262a3ae5f27b68f83738b1ee00c0360562ef03d8644decbe6c1919bc688175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(isc-dhcp-leases) \
python39-isc_dhcp_leases \
python3dist(isc-dhcp-leases)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
