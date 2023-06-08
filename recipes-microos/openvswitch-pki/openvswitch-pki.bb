SUMMARY = "Open vSwitch public key infrastructure dependency package"
DESCRIPTION = "openvswitch-pki provides PKI (public key infrastructure) support for \
Open vSwitch switches and controllers, reducing the risk of \
man-in-the-middle attacks on the Open vSwitch network infrastructure. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-pki-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "b1d12543e543aa3a9798c6679588b15b89cd55761a56f38396c09247a634b87759f53055d4b92a500bb37b841e8e7ae31b7ed6c58989ce2c78912b7e3c34c474"

RPROVIDES:${PN} += "openvswitch-dpdk-pki openvswitch-pki openvswitch-pki(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openssl(cli) openvswitch"

inherit rpm
