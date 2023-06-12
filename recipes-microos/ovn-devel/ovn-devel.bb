SUMMARY = "Development files for Open Virtual Network"
DESCRIPTION = "Devel libraries and headers for Open Virtual Network."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-devel-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "5570471dac6b3f9a7cb80a067d091995d137fa63df3fe28568690e44f47242f512e80e349b5c0a1ed84b0522a995a0187bac508cddff1af9c85a5be3f62c7e8a"

RPROVIDES:${PN} += "openvswitch-devel:/usr/include/ovn \
ovn-devel \
ovn-devel(aarch-64)"
RDEPENDS:${PN} += "libovn-23_03-0"

inherit rpm
