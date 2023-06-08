SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN host controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-host-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "7d757e4687b0ab3bd6fd58f10f2bf069dda88f13fc0cec8491396735c0232421fd39f31182ef7ff9f5fdbe90c727d12169f0a6cb286ee846a331cea1a070f758"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-controller openvswitch-ovn-host openvswitch-ovn:/usr/bin/ovn-controller ovn-host ovn-host(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libovn-23.03.so.0()(64bit) libovn-23.03.so.0(libovn_0)(64bit) openvswitch ovn"

inherit rpm
