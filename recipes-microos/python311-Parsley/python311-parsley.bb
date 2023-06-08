SUMMARY = "PEG algorithm based parser generator"
DESCRIPTION = "Parsley is a parsing library. Most parser generators like ANTLR and \
Bison are based on LL or LR parsing algorithms that compile to big \
state machine tables, whereas Parsley, like pyparsing and \
ZestyParser, uses the PEG algorithm, so each expression in the \
grammar rules works like a Python expression. In particular, \
alternatives are evaluated in order, unlike table-driven parsers such \
as yacc, bison or PLY. \
 \
The binaries are prefixed with parsley-."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python311-Parsley-1.3-5.1.noarch.rpm"
RPM_HASH = "95a01f9c274832679829e5d3ba89c885fd4a74ce1b8e803c9acabad60c5cfaa3ddd9e538da0eb9d78cf5d7381f0d3560cac7dd68b311c68bcfebbc66d40a21cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parsley) python311-Parsley python311-parsley python3dist(parsley)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
