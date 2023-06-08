SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-poetry-plugin-export-1.3.1-2.1.noarch.rpm"
RPM_HASH = "227207b590b5f5e9034a5e11811a1c86524f2eda598a44f3cb36f9536c0d6615c7ade6cd37a5f23c56a0ed4b3af3e82354f91d0a8b8775a101dc260f21cc4c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poetry-plugin-export) python311-poetry-plugin-export python311-poetry_plugin_export python3dist(poetry-plugin-export)"
RDEPENDS:${PN} += "python(abi) python311-poetry python311-poetry-core"

inherit rpm
