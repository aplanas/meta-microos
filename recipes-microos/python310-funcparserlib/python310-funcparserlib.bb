SUMMARY = "Recursive descent parsing library based on functional combinators"
DESCRIPTION = "The primary focus of funcparserlib is parsing little languages or external \
DSLs (domain specific languages). \
 \
Parsers made with funcparserlib are pure-Python LL(*) parsers. It means that \
it's very easy to write parsers without thinking about lookaheads and other \
hardcore parsing stuff. However, recursive descent parsing is a rather \
low method compared to LL(k) or LR(k) algorithms. Still, parsing with \
funcparserlib is at least twice faster than PyParsing, a very popular library \
for Python."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-funcparserlib-1.0.1-1.3.noarch.rpm"
RPM_HASH = "7ab1d11d0357a2677b555c71e674a33ed2950f0456aedad33ffdacfe130571cb53afc52a2fcc2816ae3d567ff5b5f8d914cd4d646e8db44cb6a75ad01fdcaf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcparserlib python3.10dist(funcparserlib) python310-funcparserlib python3dist(funcparserlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
