SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-poetry-plugin-export-1.4.0-1.1.noarch.rpm"
RPM_HASH = "5e9c125e0ec94126573464c8401d1c2e76c8de478fb4f7ddb9a51999bd3e245c0155f446630c53b83bb42625012da5dd4e9f7b5010b58f5e8a6bfb9bbb6f3943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poetry-plugin-export) python39-poetry-plugin-export python39-poetry_plugin_export python3dist(poetry-plugin-export)"
RDEPENDS:${PN} += "python(abi) python39-poetry python39-poetry-core"

inherit rpm
