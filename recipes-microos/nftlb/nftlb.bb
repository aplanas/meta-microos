SUMMARY = "nftables load balancer"
DESCRIPTION = "nftlb a user-space tool that builds a complete load balancer and \
traffic distributor using nftables. \
 \
* Topologies supported: Destination NAT, Source NAT, Direct Server \
  Return and Stateless DNAT. This enables the use of the load \
  balancer in one-armed and two-armed network architectures. \
* Support for both IPv4 and IPv6 families. \
* Multilayer load balancer: DSR in layer 2, IP based load balancing \
  with protocol agnostic at layer 3, and support of load balancing of \
  UDP, TCP and SCTP at layer 4. \
* Multiport support for ranges and lists of ports. \
* Multiple virtual services (or farms) support. \
* Schedulers available: weight, round robin, configurable hash (per \
  IP, port, MAC or combination of them) and symmetric hash. \
* Support of configurable persistence or client-backend affinity with \
  a timeout (per IP, port, MAC or combination of them). \
* Support of security policies per service: white and blacklists \
  (from ingress), queuing to user space filter, filtering of bogus \
  TCP frames, maximum number of established connections, limit TCP \
  RST per second, limit new connections per second and more. \
* Priority support per backend. \
* Live management of virtual services and backends programmatically \
  through a JSON API."
LICENSE = "AGPL-3.0-or-later"

PV = "1.0.7"

RPM_NAME = "nftlb-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "36f6998ad06ce51e9b9be3b9f0a56b83274b159f70dbbee64209f57f0979ea6091fa739e7fae9c247c6295269f301b474376080e41ac3dfb66230b1cb7b2264a"

RPROVIDES:${PN} += "nftlb nftlb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libev.so.4()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libnftables.so.1()(64bit) libnftables.so.1(LIBNFTABLES_1)(64bit)"

inherit rpm
