SUMMARY = "Docker network plugins for OVN"
DESCRIPTION = "This subpackage contains the OVN Docker network plugins."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-docker-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "e66a171fd21f598deb03c35a9a1e1abfcb5ce3514e42e3a86088064433ec483ab05297cb3954428df666d1127d60993cb0f688553cd8fac84dedec8ea67794de"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-docker-overlay-driver openvswitch-ovn-docker openvswitch-ovn:/usr/bin/ovn-docker-overlay-driver ovn-docker ovn-docker(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 openvswitch ovn python3-openvswitch"

inherit rpm
