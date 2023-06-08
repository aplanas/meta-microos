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

RPM_NAME = "weave-npc-2.8.1-3.7.aarch64.rpm"
RPM_HASH = "629d2db7e9054f7ddcf7a66798c01a031be2d442e90b468ee3831baa4a0c28e3282f3c7cbf5e69757c151625511ed556a925ce8e51c22801f21bb28f8ec8a788"

RPROVIDES:${PN} += "config(weave-npc) weave-npc weave-npc(aarch-64)"
RDEPENDS:${PN} += "ipset iptables ulogd ulogd-pcap"

inherit rpm
