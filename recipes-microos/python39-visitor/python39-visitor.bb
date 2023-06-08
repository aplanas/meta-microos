SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python39-visitor-0.1.3-1.18.noarch.rpm"
RPM_HASH = "4fa4041a48729ee30ec284d3484b85f91f56b3111567e63bc951836183f871e2c21a4fbe1c912a246eae477413760b72b699ac9c437281cdabea56f0dd685cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(visitor) python39-visitor python3dist(visitor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
