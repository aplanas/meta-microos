SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python311-ipy-1.01-1.10.noarch.rpm"
RPM_HASH = "0b5cd5d57ccac6a4263726d57ea42d077763f11dbf8d7335b4437bbcfc8c0da68598ad802630d7bc9b38f01932194e0413df493dd4f3178dff4cf1ade72f0773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipy) \
python311-ipy \
python3dist(ipy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
