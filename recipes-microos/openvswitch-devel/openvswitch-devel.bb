SUMMARY = "Development files for Open vSwitch"
DESCRIPTION = "Devel libraries and headers for Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-devel-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "045cf162802bcc750a0b20ed19a942340b752ff322204a4981e3869461d23464431718c6743f9e28e61efd3500e4ee5d07a971b230191acd7f822ea6d23f75bf"

RPROVIDES:${PN} += "openvswitch-devel openvswitch-devel(aarch-64) openvswitch-dpdk-devel pkgconfig(libofproto) pkgconfig(libopenvswitch) pkgconfig(libovsdb) pkgconfig(libsflow)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 libopenvswitch-3_1-0 python3-ovs"

inherit rpm
