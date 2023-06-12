SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-slimit-0.8.1-9.26.noarch.rpm"
RPM_HASH = "3347215f62ea21d4e28e77126c85789be03e2db517cd06a64c454c09a362c917ade49f350d0ce046c99bd68067db168b0796c890ae9797e902573b2ba192a4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slimit \
python3.10dist(slimit) \
python310-slimit \
python3dist(slimit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-ply \
python310-setuptools \
update-alternatives"

inherit rpm
