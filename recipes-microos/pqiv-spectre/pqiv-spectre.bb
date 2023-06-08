SUMMARY = "Backend spectre for pqiv"
DESCRIPTION = "Backend spectre for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-spectre-2.12-1.4.aarch64.rpm"
RPM_HASH = "958f0af03edc4e0f8ec8522a3f4fc26aa3c1cc1e683038efb5c5a3e91ace5973473b78ee7c7626b4932a6e93e21d8ee83e112d1f29abce64bddd635617c794c8"

RPROVIDES:${PN} += "pqiv-spectre pqiv-spectre(aarch-64)"
RDEPENDS:${PN} += "libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libspectre.so.1()(64bit) pqiv"

inherit rpm
