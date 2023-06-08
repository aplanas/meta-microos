SUMMARY = "OpenVPN plugin header"
DESCRIPTION = "This package provides the header file to build external plugins."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.3"

RPM_NAME = "openvpn-devel-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "f2f500e68b7d7556d44521221145f73f48398ebb2a198021d0c40f8967485437a0557a7f80c52dfcd48aa89f12e1cfa680d7ebcabbb3602df99a25f8fac0b8af"

RPROVIDES:${PN} += "openvpn-devel openvpn-devel(aarch-64)"
RDEPENDS:${PN} += "openvpn"

inherit rpm
