SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-pilkit-2.0-6.6.noarch.rpm"
RPM_HASH = "b7b0a1a6faf0a3efb1e156b6602dcdb0cee0aca7cf97e461fefb8350020381037abd2248cf52ba9d0dbc4c21eba8313fec5d3f8b96e6b4ad5c2b08e5a79377aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pilkit python3.10dist(pilkit) python310-pilkit python3dist(pilkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
