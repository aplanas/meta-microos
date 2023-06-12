SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python310-pprintpp-0.4.0-6.2.noarch.rpm"
RPM_HASH = "7c55b3a40397171d006f880fa4c0ea40b6676f5ffcb1a1d7f4f576a02d394bf9f68c432fa735f844338be165867050736eb16b6499d6090752cce65e10c83718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pprintpp \
python3.10dist(pprintpp) \
python310-pprintpp \
python3dist(pprintpp)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
