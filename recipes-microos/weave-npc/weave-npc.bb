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

RPM_NAME = "weave-npc-2.8.1-3.8.aarch64.rpm"
RPM_HASH = "0afc8d00ae36737862d380c3f5ff58678c9131022a3744ce10639703d392420a53090c12cc69c6dc3c3782437e8ccc9fb1ab1f2b876ebef7d6082f960a65b06e"

RPROVIDES:${PN} += "config(weave-npc) \
weave-npc \
weave-npc(aarch-64)"
RDEPENDS:${PN} += "ipset \
iptables \
ulogd \
ulogd-pcap"

inherit rpm
