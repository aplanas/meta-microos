SUMMARY = "Open vSwitch test package"
DESCRIPTION = "Open vSwitch is a software-based Ethernet switch. \
 \
This package contains utilities that are useful to diagnose \
performance and connectivity issues in Open vSwitch setup."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-test-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "d17f915143b7dd4f615b0296249a023553ad01496aa2617e096575afe9fec153e04b8bbf5e28f4c44b527a5bde43bd6e65e277aab0c62ee386eaca22490b8c79"

RPROVIDES:${PN} += "openvswitch-test openvswitch-test(aarch-64) python3-openvswitch-test"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) openvswitch python(abi) python3 python3-Twisted python3-ovs"

inherit rpm
