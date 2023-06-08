SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python310-publicsuffixlist-0.9.1-1.3.noarch.rpm"
RPM_HASH = "5c673fa4492c438ac8a17f3cb91bd58d7435878795d6c679190a621b5f890f51d15b8b5be96626fbe9f7e18aa2f5e25278d0fbb32d5d8d96aa39069e1c37b909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffixlist python3.10dist(publicsuffixlist) python310-publicsuffixlist python3dist(publicsuffixlist)"
RDEPENDS:${PN} += "publicsuffix python(abi)"

inherit rpm
