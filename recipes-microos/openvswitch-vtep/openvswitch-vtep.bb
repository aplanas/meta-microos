SUMMARY = "Open vSwitch VTEP emulator"
DESCRIPTION = "A VTEP (VXLAN Tunnel EndPoint) emulator that uses Open vSwitch for \
forwarding. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-vtep-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "b05e8bd9f158ef64ac77d9e9bc313897b5dbc43d5a5305800dff6dacd561d6872954b2edaf2d00f3e1cb2890269a4dce1b1213f4ded9e70302c1ddbb08d9d8ba"

RPROVIDES:${PN} += "openvswitch-dpdk-vtep openvswitch-vtep openvswitch-vtep(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libvtep-3.1.so.0()(64bit) libvtep-3.1.so.0(libvtep_0)(64bit) openvswitch openvswitch-switch python3-ovs"

inherit rpm
