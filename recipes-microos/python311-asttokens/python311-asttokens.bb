SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python311-asttokens-2.2.1-2.1.noarch.rpm"
RPM_HASH = "1d283888f68e468304837466976c565bcea8dd2da11fbeddbdda78a1ede342f910ed67efc7ca23d333940e3aa723472311a6721dd3125ddd58b543f616c36f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asttokens) \
python311-asttokens \
python3dist(asttokens)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
