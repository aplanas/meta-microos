SUMMARY = "Simplified python interface to the DQSEGDB API"
DESCRIPTION = "DQSEGDB2 is a simplified Python implementation of the DQSEGDB API \
as defined in LIGO-T1300625, providing a query interface for GET \
requests to DQSEGDB."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python38-dqsegdb2-1.1.3-1.1.noarch.rpm"
RPM_HASH = "e20df3cdba7ad1fb574951801f8ad438b9d297102221e7bc02775984ddb42a8c9f421e0ba698e45d235008a8396014781fa20478347316818c9234a1da58bd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(dqsegdb2) python38-dqsegdb2 python3dist(dqsegdb2)"
RDEPENDS:${PN} += "python(abi) python38-gwdatafind python38-igwn-auth-utils python38-ligo-segments"

inherit rpm
