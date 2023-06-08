SUMMARY = "Network emulator for rapid prototyping of Software Defined Networks (SDN)"
DESCRIPTION = "Mininet emulates a complete network of hosts, links, and switches on a single \
machine. Mininet is useful for interactive development, testing, and demos, especially \
those using OpenFlow and SDN. OpenFlow-based network controllers prototyped in \
Mininet can usually be transferred to hardware with minimal changes for full \
line-rate execution."
LICENSE = "MIT & GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "mininet-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "4a931b7a5b30e4d53ed818965b3f504cf1fcbb5d2ae775ed66c62d32091011af720f47640ef754dd64658633e141cf76b66360f7dc9be871c66b1360adf7d368"

RPROVIDES:${PN} += "mininet mininet(aarch-64) python3.10dist(mininet) python3dist(mininet)"
RDEPENDS:${PN} += "/usr/bin/python3 ethtool iperf iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) openvswitch python(abi) socat telnet"

inherit rpm
