SUMMARY = "Meta-language for DSL implementation inspired by Xtext"
DESCRIPTION = "textX is a meta-language for building Domain-Specific Languages (DSLs) in Python. \
It is inspired by Xtext. \
 \
From a single language description (grammar), textX will build a \
parser and a meta-model (a.k.a. abstract syntax) for textual \
languages. Own languages can be invented or support for already \
existing textual language or file format be built. \
 \
textX follows the syntax and semantics of Xtext, but differs in some places \
and is implemented in Python using the Arpeggio PEG parser - no grammar \
ambiguities, unlimited lookahead, interpreter style of work."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-textX-3.0.0-1.8.noarch.rpm"
RPM_HASH = "85d42172f2f7258df00c1435e9f1ebb79a2165d090f417213a845f0e215c4814c2702d67cb4c7a93733cfd3e8e56617d17fec9b333dc10bfe7069e89b93c16f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(textx) python39-textX python3dist(textx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Arpeggio python39-click python39-future python39-setuptools update-alternatives"

inherit rpm
