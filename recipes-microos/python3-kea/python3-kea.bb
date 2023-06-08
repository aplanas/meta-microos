SUMMARY = "Python interface to Kea DHCP server"
DESCRIPTION = "Python3 interface to ISC Kea DHCP server."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "python3-kea-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "c178cbdfaebaf1c541e50bc9db0ffba42358236705f61fc6e4348f5a43e6fcbc85cc3e71ee6de65653f40dcc5b01cfc2e4e63291ebe7f4d975e5537065582d3e"

RPROVIDES:${PN} += "python3-kea python3-kea(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
