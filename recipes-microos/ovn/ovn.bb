SUMMARY = "Open Virtual Network diagnostic utilities"
DESCRIPTION = "OVN, the Open Virtual Network, is a system to support virtual network \
abstraction.  OVN complements the existing capabilities of OVS to add \
native support for virtual network abstractions, such as virtual L2 and L3 \
overlays and security groups."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "980d92d030e8676711870b57643a980ea1d5bdb90fe95d7b25eb2c5eb76a9d40bcb20d4c195f972d2e5a758a9e07d40bc18c26cf44bd540c340ca79ec4fb6e0b"

RPROVIDES:${PN} += "config(ovn) openvswitch-dpdk-ovn openvswitch-ovn openvswitch-ovn-common ovn ovn(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libovn-23.03.so.0()(64bit) libovn-23.03.so.0(libovn_0)(64bit) openvswitch"

inherit rpm
