SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-linkify-it-py-2.0.0-2.1.noarch.rpm"
RPM_HASH = "25a64f9d2fcbf7123d10b5896279d6cc05a2315516cff31264664d30adaf8175c7616439cfbd7af4e590ad467bf7a06a5f5eb94eaffa234f263b7fc5cc4f53fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linkify-it-py python3.10dist(linkify-it-py) python310-linkify-it-py python3dist(linkify-it-py)"
RDEPENDS:${PN} += "python(abi) python310-uc-micro-py"

inherit rpm
