SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python310-pyparsing-3.0.9-4.1.noarch.rpm"
RPM_HASH = "70804a71bf860d526ee41c71fdb555b278bc54602ee15f4df4e64feb25a9cd8f859c06fc964a7bdac425754ef8212c7dfc8c15c4022d5b05979f983ff9b8393d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparsing python3.10dist(pyparsing) python310-pyparsing python3dist(pyparsing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
