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

RPM_NAME = "python310-textX-3.0.0-1.8.noarch.rpm"
RPM_HASH = "a427b0ca2a2523d216c6ba38c09dfd515e3630f285f1d1cca0adf56559432049564379b4a16db261421f6425fc77191bdc846dc4600416da1adfac2ffd44cdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textX python3.10dist(textx) python310-textX python3dist(textx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Arpeggio python310-click python310-future python310-setuptools update-alternatives"

inherit rpm
