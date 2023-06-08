SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-CommonMark-0.9.1-8.1.noarch.rpm"
RPM_HASH = "4a136748613270e9fb53ffdf0c226550d0d6791d126752f345925ef2483a99e249b711b9769de1144a3707bf8e1d0eef9463d9a690bd6c98e9718eb05a9d8afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python python3.11dist(commonmark) python311-CommonMark python311-commonmark python3dist(commonmark)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
