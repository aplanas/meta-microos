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

RPM_NAME = "python311-textX-3.0.0-1.8.noarch.rpm"
RPM_HASH = "462be77dd590f9f45d4ab5589e1efb011937e10549edc16786aee3cd8ded2f12b3ee14e790f0f39010b2d12abe58e0c153a49c588e9a90f635a9e90538f98012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(textx) \
python311-textX \
python3dist(textx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Arpeggio \
python311-click \
python311-future \
python311-setuptools \
update-alternatives"

inherit rpm
