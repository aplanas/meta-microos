SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python310-ipy-1.01-1.10.noarch.rpm"
RPM_HASH = "7bcc9425f5ce775923cf112e354b3d887e7c6f4702a7a8f7cfeba0bcee5f9b488f342b8befa8b26766852d145b420443e7fb123a4c0bf82ea4ef654906f291ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipy python3.10dist(ipy) python310-ipy python3dist(ipy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
