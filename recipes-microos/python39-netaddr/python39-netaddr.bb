SUMMARY = "Pythonic manipulation of IPv4, IPv6, CIDR, EUI and MAC network addresses"
DESCRIPTION = "A pure Python network address representation and manipulation library. \
 \
netaddr provides a Pythonic way of working with: \
    - IPv4 and IPv6 addresses and subnets (including CIDR notation); \
    - MAC (Media Access Control) addresses in multiple formats; \
    - IEEE EUI-64, OUI and IAB identifiers; \
    - a user friendly IP glob-style format. \
 \
Included are routines for: \
    - generating, sorting and summarizing IP addresses; \
    - converting IP addresses and ranges between various different formats; \
    - performing set based operations on groups of IP addresses and subnets; \
    - arbitrary IP address range calculations and conversions; \
    - querying IEEE OUI and IAB organisational information; \
    - querying of IP standards related data from key IANA data sources."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-netaddr-0.8.0-2.11.noarch.rpm"
RPM_HASH = "ec8022546c64a8df8bd54255989bf93e60715837460917458dc2d15cff437689065e68d6ae7cf78654f05438a288852178aa51a39ea1f0e9b4d210c9d1f7316f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(netaddr) python39-netaddr python3dist(netaddr)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-importlib-metadata python39-importlib_resources update-alternatives"

inherit rpm
