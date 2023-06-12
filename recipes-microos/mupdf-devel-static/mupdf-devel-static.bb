SUMMARY = "Development Files for mupdf"
DESCRIPTION = "This package contains development files needed for developing applications \
based on mupdf."
LICENSE = "AGPL-3.0-or-later"

PV = "1.22.1"

RPM_NAME = "mupdf-devel-static-1.22.1-1.1.aarch64.rpm"
RPM_HASH = "077334c686be32b36d1cd793069725181ff1c1b75d4080e056c5eadef9e0121cc179d997b62a6f66e4cb61b5b0b757159c0a475ec10c48073257ec0824d11be1"

RPROVIDES:${PN} += "mupdf-devel-static mupdf-devel-static(aarch-64)"
RDEPENDS:${PN} += "mupdf"

inherit rpm
