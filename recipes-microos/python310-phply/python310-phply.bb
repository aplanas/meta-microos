SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python310-phply-1.2.6-1.2.noarch.rpm"
RPM_HASH = "55afeb4696d2bb42c073259f57754784631cf4c636bf9132bd1859735575228bb7567ff3004765858a7c3e47dfe021bd9eda0a5d02de009e0c3303d0a773b519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phply python3.10dist(phply) python310-phply python3dist(phply)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-ply update-alternatives"

inherit rpm
