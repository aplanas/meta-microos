SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.16.3"

RPM_NAME = "python310-fastjsonschema-2.16.3-1.2.noarch.rpm"
RPM_HASH = "08e0228012f8cc707b9d6dd72251e52a7cc1cb17f8f900f187e2439126579100ddf15cf9ba0c090efdf66fb7b91573c3782ec6c3f2ed3d427db363ba15cc7787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastjsonschema python3.10dist(fastjsonschema) python310-fastjsonschema python3dist(fastjsonschema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
