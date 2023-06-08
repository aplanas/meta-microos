SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-interrogate-1.5.0-1.4.noarch.rpm"
RPM_HASH = "8955e5451200a7ea5f99658aced545c613bd6777cee7ca445fb39d0956703643c78c886c4eb638bccaea1d4c0944fa81716fce04e520b72f7ba615ec8c8710fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-interrogate python3.10dist(interrogate) python310-interrogate python3dist(interrogate)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-attrs python310-click python310-colorama python310-py python310-tabulate python310-toml update-alternatives"

inherit rpm
