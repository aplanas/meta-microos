SUMMARY = "Identity-aware, multi-protocol access proxy"
DESCRIPTION = "Teleport is the easiest, most secure way to access all your infrastructure. Teleport is an identity-aware, multi-protocol access proxy which understands SSH, HTTPS, RDP, Kubernetes API, MySQL, MongoDB and PostgreSQL wire protocols. \
 \
On the server-side, Teleport is a single binary which enables convenient secure access to behind-NAT resources such as: \
* SSH nodes - SSH works in browsers too! \
* Kubernetes clusters \
* PostgreSQL, MongoDB, CockroachDB and MySQL databases \
* Internal Web apps \
* Windows Hosts \
* Networked servers"
LICENSE = "Apache-2.0"

PV = "12.3.3"

RPM_NAME = "teleport-12.3.3-1.1.aarch64.rpm"
RPM_HASH = "e8a9d10ec95b836b2147068853c2268a641f3f771868abb21a7686aba1c29a942e4d29a2015f408756995681e220bc25bc92863aca00faae7fdf9c5dec97576d"

RPROVIDES:${PN} += "config(teleport) teleport teleport(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) teleport-tctl"

inherit rpm
