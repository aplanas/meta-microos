SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python39-pycparser-2.21-2.1.noarch.rpm"
RPM_HASH = "348010fd3e6af8daa0aa923813e67e9b599aa69fbcece75658502d390ff67ec8a52641c99642cf9e4b11fb6b12bdffb9277ad5fdabfd48485af2bcc2b0e6d193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycparser) python39-pycparser python3dist(pycparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
