SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python310-ipaddr-2.2.0-1.16.noarch.rpm"
RPM_HASH = "cafa1768e1ca13e8c3ad826e37589330fd36869a04deb70f463627b9b28be691af36df965b755915bb1fbea72474b919a7b25e369832b23a95d01c0eb471cd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipaddr python3.10dist(ipaddr) python310-ipaddr python3dist(ipaddr)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
