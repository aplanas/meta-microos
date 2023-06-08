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

RPM_NAME = "python310-ply-3.11-5.1.noarch.rpm"
RPM_HASH = "b8428a0a3d39e5fba3841d4b48a973ed4d225f2a787edae6ef2567b76dc7018e8d0e4edad1c6478e95d76e01082221a4a7981eb9b11ca4dd79a4595f2c419a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ply python3.10dist(ply) python310-ply python3dist(ply)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
