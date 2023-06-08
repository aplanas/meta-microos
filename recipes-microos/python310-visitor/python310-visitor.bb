SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python310-visitor-0.1.3-1.18.noarch.rpm"
RPM_HASH = "6685ba2f9ca41900b5b5571afd181fabdcd98c38fb175d2219d034363bf21ebb1d4b17fa54700bd813dd68b56578d5e80408b35fbf1cf28c041d4f0cf9f4fea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visitor python3.10dist(visitor) python310-visitor python3dist(visitor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
