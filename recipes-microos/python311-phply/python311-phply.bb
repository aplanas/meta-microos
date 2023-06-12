SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python311-phply-1.2.6-1.2.noarch.rpm"
RPM_HASH = "08b188d2a66fdfc0c3b9f1c290c79a3c1953e93cbdf877a3e9f0725a76d8c2fe90507a168dc7c9a6951ef4917d145105d00656c068c3284028c9a59b13d9321c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(phply) \
python311-phply \
python3dist(phply)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-ply \
update-alternatives"

inherit rpm
