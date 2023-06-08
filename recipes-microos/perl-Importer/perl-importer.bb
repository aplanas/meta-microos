SUMMARY = "Alternative but compatible interface to modules that export symbols"
DESCRIPTION = "This module acts as a layer between Exporter and modules which consume \
exports. It is feature-compatible with Exporter, plus some much needed \
extras. You can use this to import symbols from any exporter that follows \
Exporters specification. The exporter modules themselves do not need to use \
or inherit from the Exporter module, they just need to set '@EXPORT' and/or \
other variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.026"

RPM_NAME = "perl-Importer-0.026-1.12.noarch.rpm"
RPM_HASH = "9774692910192e9d8dee957d183c6a58a756a4c94813d43913bd83cbe2681a10728f1a8843414659a66378505ea5d14ba3b0d1f617fdd8103ef34cded667031f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Importer) perl-Importer"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
