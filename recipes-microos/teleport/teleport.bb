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

PV = "13.0.3"

RPM_NAME = "teleport-13.0.3-1.1.aarch64.rpm"
RPM_HASH = "71d749a5a966c3d4233cbe4cb66fe71601de072574b9418b12f85f3be2619222636b66b0405f4cccd366a20b5b5f42476215a1964871a6c7eb7ea58b7b97c057"

RPROVIDES:${PN} += "config(teleport) \
teleport \
teleport(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
teleport-tctl"

inherit rpm
