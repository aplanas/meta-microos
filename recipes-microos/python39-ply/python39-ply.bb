SUMMARY = "Python Lex & Yacc"
DESCRIPTION = "PLY is yet another implementation of lex and yacc for Python. Some notable \
features include the fact that its implemented entirely in Python and it \
uses LALR(1) parsing which is efficient and well suited for larger grammars. \
 \
PLY provides most of the standard lex/yacc features including support for empty \
productions, precedence rules, error recovery, and support for ambiguous grammars. \
 \
PLY provides extensive error checking. \
It is compatible with both Python 2 and Python 3."
LICENSE = "BSD-3-Clause"

PV = "3.11"

RPM_NAME = "python39-ply-3.11-5.1.noarch.rpm"
RPM_HASH = "bd5b7d5d2997f5f85a13197607641336f73dc69a464d705fab24ef91eb0ef83818163350d5fa19aeac3fa6d3c293b270b7a962d6b307c48d5be462812e3d9f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ply) python39-ply python3dist(ply)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
