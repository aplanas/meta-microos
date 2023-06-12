SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python310-args-0.1.0-2.15.noarch.rpm"
RPM_HASH = "a9908c9a3c90b11c948ecb4f2aeebd717a9c3df68dfbc1f94b9fc5b635ccc1da8f827935f2937731c0710912b685af62dadc4a2cb76e04b1ca63763668af2616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-args \
python3.10dist(args) \
python310-args \
python3dist(args)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
