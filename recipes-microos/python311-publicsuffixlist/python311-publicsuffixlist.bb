SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python311-publicsuffixlist-0.9.1-1.3.noarch.rpm"
RPM_HASH = "63c5d95940a5d2bb24697cb48e717e9a5e8925a4c4e9be7a4331c366bff00d078e056796e592d6d955e12eeaf7e85d56018dcada4d5bf8c16b464ef346c99361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(publicsuffixlist) python311-publicsuffixlist python3dist(publicsuffixlist)"
RDEPENDS:${PN} += "publicsuffix python(abi)"

inherit rpm
