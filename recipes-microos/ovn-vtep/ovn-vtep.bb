SUMMARY = "Open Virtual Network VTEP controller for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN VTEP (VXLAN Tunnel Endpoint) controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-vtep-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "9582148bc82115b0b498afa7f93689fbe42973aeca154af1c51c94fbe9c8eb8004fae51db3156cc3374896478184845deb45a83a1e38c120d3719d26dff71daf"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-controller-vtep openvswitch-ovn-vtep openvswitch-ovn:/usr/bin/ovn-controller-vtep ovn-vtep ovn-vtep(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libovn-23.03.so.0()(64bit) libovn-23.03.so.0(libovn_0)(64bit) libvtep-3.1.so.0()(64bit) libvtep-3.1.so.0(libvtep_0)(64bit) openvswitch ovn"

inherit rpm
