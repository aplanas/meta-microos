SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python310-peppercorn-0.6-3.14.noarch.rpm"
RPM_HASH = "9feec47fdf0edd70f5879f5b3cb5aefff9e98f8326f97e129cd0c9fc92c23dcfd13857a9a669bd72267625098fd587bbb97c27e6e34fa598399f78292a2029ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-peppercorn python3.10dist(peppercorn) python310-peppercorn python3dist(peppercorn)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
