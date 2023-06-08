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

RPM_NAME = "python311-asteval-0.9.29-1.3.noarch.rpm"
RPM_HASH = "00bf1b15761dd606f11d225cc60e489cac49b22ad7aa883a96b0dde973876d4a58e0067246675c88ef3b8194dd4452d9fb58fd7901a1602f4f1a91c33c1dfb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asteval) python311-asteval python3dist(asteval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
