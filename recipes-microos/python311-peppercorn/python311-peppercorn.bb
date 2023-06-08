SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python311-peppercorn-0.6-3.14.noarch.rpm"
RPM_HASH = "a011e37732d0b440a5b46314ac879c145c15c91c38201e3be2012dff5f786f7ea940dceaf59f59ac277f96744b048527bec66b6bed6e80901bc60f93ec312253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(peppercorn) python311-peppercorn python3dist(peppercorn)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
