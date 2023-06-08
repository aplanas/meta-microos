SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python310-Jinja2-3.1.2-3.1.aarch64.rpm"
RPM_HASH = "f72faffaf8a1ac32bf08d5420d1f0bee6256b62a78a523aaafee4f8ea0584d7a20083e6b987a678eda5cc12e253f1c3cf6ad725a2e3c462aa1969945b238e7ac"

RPROVIDES:${PN} += "python3-Jinja2 python3-jinja2 python3.10dist(jinja2) python310-Jinja2 python310-Jinja2(aarch-64) python310-jinja2 python3dist(jinja2)"
RDEPENDS:${PN} += "python(abi) python310-MarkupSafe"

inherit rpm
