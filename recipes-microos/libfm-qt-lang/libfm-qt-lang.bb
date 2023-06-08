SUMMARY = "Translations for package libfm-qt"
DESCRIPTION = "Provides translations for the 'libfm-qt' package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "4df2a579b98e2d9fb745c3973a59d41b973e874859cd022203e45bc7b2100af7426fb02efefa46a9baad08f9b1c64596e145ac1d1a34058640001f6a45cea9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt-lang libfm-qt-lang-all"
RDEPENDS:${PN} += "libfm-qt13"

inherit rpm
