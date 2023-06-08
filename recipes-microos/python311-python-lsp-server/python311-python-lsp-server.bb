SUMMARY = "Python Language Server for the Language Server Protocol"
DESCRIPTION = "Python Language Server for the Language Server Protocol \
 \
Fork of the python-language-server project, maintained by \
the Spyder IDE team and the community \
 \
If the respective recommended packages are installed, the following optional providers \
will be enabled: \
 \
- Rope for Completions and renaming \
- Pyflakes linter to detect various errors \
- McCabe linter for complexity checking \
- pycodestyle linter for style checking \
- pydocstyle linter for docstring style checking (disabled by default) \
- autopep8 for code formatting \
- YAPF for code formatting (preferred over autopep8)"
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python311-python-lsp-server-1.7.2-1.1.noarch.rpm"
RPM_HASH = "48144fd0b3313f11fcc37613f7eec932955a32b62d33fc4229eca463268dc2e81e3003ceecaf3abf11e29198dfea57d59d6bcd91dbcf03372b77905f3b651f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-lsp-server) python311-python-lsp-server python3dist(python-lsp-server)"
RDEPENDS:${PN} += "(python311-jedi >= 0.17.2 with python311-jedi < 0.19.0) /bin/sh /usr/bin/python3.11 python(abi) python311-docstring-to-markdown python311-pluggy python311-python-lsp-jsonrpc python311-setuptools python311-ujson update-alternatives"

inherit rpm
