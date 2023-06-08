SUMMARY = "Translations for package nudoku"
DESCRIPTION = "Provides translations for the 'nudoku' package."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "nudoku-lang-2.1.0-1.10.noarch.rpm"
RPM_HASH = "36155efe26bee6371153d9ac6fba8e182eda81125e019ca7bc62f59da4c5a3479ab7e2a31e5becbb3db720c3e1e5326b94ccc7177e35fa2685f024bbb78b6bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nudoku:de) locale(nudoku:es) locale(nudoku:fr) locale(nudoku:ja) locale(nudoku:ru) nudoku-lang nudoku-lang-all"
RDEPENDS:${PN} += "nudoku"

inherit rpm
