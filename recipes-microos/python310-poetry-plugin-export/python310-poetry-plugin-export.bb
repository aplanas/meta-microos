SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-poetry-plugin-export-1.3.1-2.1.noarch.rpm"
RPM_HASH = "7959e3d069fb29b2be46f7e53331e675799599f69d3925c65c49904ecdc4fd62375aa4f2432e1dde1c659380081ae615924499bb043fd28deb65f4734ea0bde3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-plugin-export python3-poetry_plugin_export python3.10dist(poetry-plugin-export) python310-poetry-plugin-export python310-poetry_plugin_export python3dist(poetry-plugin-export)"
RDEPENDS:${PN} += "python(abi) python310-poetry python310-poetry-core"

inherit rpm
