SUMMARY = "Development files for Open vSwitch"
DESCRIPTION = "Devel libraries and headers for Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-devel-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "15a6663a37d801fe79654bec5f7d4d4bdbf8528651135267e819301e6b396267d0f64353c4aad14e44e47fbf9ec859482ab2ad05d17285530331579024e8a405"

RPROVIDES:${PN} += "openvswitch-devel openvswitch-devel(aarch-64) openvswitch-dpdk-devel pkgconfig(libofproto) pkgconfig(libopenvswitch) pkgconfig(libovsdb) pkgconfig(libsflow)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 libopenvswitch-3_1-0 python3-ovs"

inherit rpm
