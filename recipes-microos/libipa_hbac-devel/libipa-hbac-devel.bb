SUMMARY = "Development files for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libipa_hbac-devel-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "9191f7a97fb16dec0c38f639beb49aef4daa73de63c22c541006221c3400fc1a27a5e52a3bbb961704c07176919264f6fde0bacd13d9726e2a47f36a033a550d"

RPROVIDES:${PN} += "libipa_hbac-devel libipa_hbac-devel(aarch-64) pkgconfig(ipa_hbac)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libipa_hbac0"

inherit rpm
