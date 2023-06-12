SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.16.21.g693fee1"

RPM_NAME = "libnuma-devel-2.0.16.21.g693fee1-1.1.aarch64.rpm"
RPM_HASH = "182454aafd73531e76ac13d6a0d8e0c98fab38f785325567ea18b512d96499190b74028e466f7ce07685a7c575d5db506f76f14bb89bbf06569a4bd091b5fc82"

RPROVIDES:${PN} += "libnuma-devel \
libnuma-devel(aarch-64) \
pkgconfig(numa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnuma1"

inherit rpm
