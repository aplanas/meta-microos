SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-CommonMark-0.9.1-8.1.noarch.rpm"
RPM_HASH = "e97cd91186387084cfe5499e950b77bacd312ac83412551309fd4c6139afbb3f7b29a749f3a0bae52d3e6c690403c721b957dc3621d66e68a999f1ef1428921f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3-CommonMark \
python3-commonmark \
python3.10dist(commonmark) \
python310-CommonMark \
python310-commonmark \
python3dist(commonmark)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
