SUMMARY = "Safe, minimalistic evaluator of python expression using ast module"
DESCRIPTION = "ASTEVAL provides a numpy-aware, safe(ish) 'eval' function \
 \
Emphasis is on mathematical expressions, and so numpy ufuncs \
are used if available.  Symbols are held in the Interpreter \
symbol table 'symtable':  a simple dictionary supporting a \
simple, flat namespace. \
 \
Expressions can be compiled into ast node for later evaluation, \
using the values in the symbol table current at evaluation time."
LICENSE = "MIT"

PV = "0.9.29"

RPM_NAME = "python310-asteval-0.9.29-1.3.noarch.rpm"
RPM_HASH = "affe24cb28e3d73b4d012dc1aa7d6e0ec9f5b628ea25fa05f5f3b619eb6c1026a685b9594e63c6ebe063be8d73e2689364f0a2c6b9c0a79a2835acdfbd9c3933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asteval python3.10dist(asteval) python310-asteval python3dist(asteval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
