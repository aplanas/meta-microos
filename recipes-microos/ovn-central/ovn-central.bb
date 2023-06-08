SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN database and northbound daemon."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-central-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "c5db1a3b7ecab298f6caccff252a3c5cfec5cc3fb00b40529f571186b1a9f159380949d64ffa781eb7fa9844fea14602dd3bf8cedd34aaebc81c7cefbeb1effe"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-northd openvswitch-ovn-central openvswitch-ovn:/usr/bin/ovn-northd ovn-central ovn-central(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libovn-23.03.so.0()(64bit) libovn-23.03.so.0(libovn_0)(64bit) openvswitch ovn"

inherit rpm
