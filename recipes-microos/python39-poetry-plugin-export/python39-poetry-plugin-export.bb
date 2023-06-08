SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-poetry-plugin-export-1.3.1-2.1.noarch.rpm"
RPM_HASH = "71f813ba82bc066f001f4bfb482242ec88721d1aa0f237411359e954188fac83a535d68afaee13d6987cf7279a181f372c07ffef124f43266fa32f0c8410b5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poetry-plugin-export) python39-poetry-plugin-export python39-poetry_plugin_export python3dist(poetry-plugin-export)"
RDEPENDS:${PN} += "python(abi) python39-poetry python39-poetry-core"

inherit rpm
