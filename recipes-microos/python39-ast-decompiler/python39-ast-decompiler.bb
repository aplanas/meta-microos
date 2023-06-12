SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-ast-decompiler-0.7.0-1.4.noarch.rpm"
RPM_HASH = "a9b1c2b181fa1566160ee2b4efd8d25d436463dff4a08aab58f610ae37a9cb72a90570791abdc87e86fffeba34294629e07f48aab485489417278f625682bccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ast-decompiler) \
python39-ast-decompiler \
python3dist(ast-decompiler)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
