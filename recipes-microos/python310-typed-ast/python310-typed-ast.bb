SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python310-typed-ast-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "19c0dd1a7fafb820ae0d10974b02b1ea700317faadb5abfb5b60f224f2ad320a5d2d559bdf2748ee018a9086e5ae28fd855b4bbf3be3129dd1dbc67b4af11808"

RPROVIDES:${PN} += "python3-typed-ast python3.10dist(typed-ast) python310-typed-ast python310-typed-ast(aarch-64) python3dist(typed-ast)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
