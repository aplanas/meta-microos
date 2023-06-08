SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python310-baron-0.10.1-1.7.noarch.rpm"
RPM_HASH = "6ae1a3d920ec9403e999a65e8c0556c1676e69ac656496a9d7cb579959d3e2313eb432a2e30676d5238be875db38130f696cf2221f565593b6ce5ae565452284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-baron python3.10dist(baron) python310-baron python3dist(baron)"
RDEPENDS:${PN} += "python(abi) python310-rply"

inherit rpm
