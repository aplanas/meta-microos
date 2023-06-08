SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-pilkit-2.0-6.6.noarch.rpm"
RPM_HASH = "0529cc470a98e7d47d26a14cc34d896478652148d6144f971916c4be79592d2888c28f3d66f358797d0a67bf82604047c83a8f5bdf2ed288cc2ebd7c7752c3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pilkit) python311-pilkit python3dist(pilkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
