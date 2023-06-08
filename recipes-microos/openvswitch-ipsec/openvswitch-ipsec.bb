SUMMARY = "Open vSwitch IPsec tunneling support"
DESCRIPTION = "This package provides IPsec tunneling support for OVS tunnels."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-ipsec-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "7cff78b1dba4ac23c910c9aad48f6ef0c67ad3969dfab728e8f29fec6621dfc0c8335af3933fba136fe239d6e0f50ab1b7a70c50edab8697ef0ec7a70ab7a5d7"

RPROVIDES:${PN} += "openvswitch-ipsec openvswitch-ipsec(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 openvswitch python3-ovs strongswan"

inherit rpm
