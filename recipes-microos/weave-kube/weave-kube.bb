SUMMARY = "Pod Network Add-On"
DESCRIPTION = "Weave Net creates a virtual network that connects containers across multiple \
hosts and enables their automatic discovery. With Weave Net, portable \
microservices-based applications consisting of multiple containers can run \
anywhere: on one host, multiple hosts or even across cloud providers and data \
centers. Applications use the network just as if the containers were all plugged \
into the same network switch, without having to configure port mappings, \
ambassadors or links. \
 \
This package contains the files to be included into the weave-kube container image"
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "weave-kube-2.8.1-3.7.aarch64.rpm"
RPM_HASH = "8412d5a6adf391aea8419d3a7a83cfd8db4fb08e59bd3d150df5093e6af07fd6f81643d983cbeced9d50feac2f85297bbce98d519391b7f3e2ce266223cf63da"

RPROVIDES:${PN} += "weave-kube weave-kube(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/modprobe bind-utils ca-certificates-mozilla conntrack-tools curl iproute2 ipset iptables libc.so.6(GLIBC_2.34)(64bit) libpcap.so.1()(64bit)"

inherit rpm
