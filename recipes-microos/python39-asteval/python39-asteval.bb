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

RPM_NAME = "python39-asteval-0.9.29-1.3.noarch.rpm"
RPM_HASH = "7b2fe5f173f8d48c6b9c98c77468a7edc5ac612605d4cc8bd3be37573a00b48fd0ea5d8f174e1fda61f50e3d8377c67fa12b8f499fd374b87a7d1e37e6fa994a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asteval) python39-asteval python3dist(asteval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
