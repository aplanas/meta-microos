SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "2.21"

RPM_NAME = "python311-pycparser-2.21-2.1.noarch.rpm"
RPM_HASH = "06be801125a8fb642f269644cef7605669a854e6a8ce6608e867c34fbac380f7aee22172aadeabe9abfab972d9174a9ad22390adcddf29abc9f2f4289d86fe48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pycparser) \
python311-pycparser \
python3dist(pycparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
