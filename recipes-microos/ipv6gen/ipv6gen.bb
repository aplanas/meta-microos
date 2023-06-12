SUMMARY = "IPv6 prefix generator"
DESCRIPTION = "ipv6gen features: \
generates prefix list of certain length from given prefix \
via one of the 3 methods described in RFC 3531"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "ipv6gen-1.0-1.10.noarch.rpm"
RPM_HASH = "290ff08d38620d5133e6421cfa7986e05b77d19f7fdb9a3cf66a505c05186851d4373611922fc4fc9d593de3a6ebca85812c7d76aaa1666a105ac62a9e073741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipv6gen"
RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
