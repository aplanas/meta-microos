SUMMARY = "Translations for package terminology"
DESCRIPTION = "Provides translations for the 'terminology' package."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-lang-1.13.0-1.2.noarch.rpm"
RPM_HASH = "67bb0bbdb9f2951f1369328398a66913c7f587b9f0796b8bb477dd2a888c6beaa112adeee679cac9a600c84de698714f7350de9dafcc9e1d5d8ead27451d36d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(terminology:ca) locale(terminology:da) locale(terminology:de) locale(terminology:el) locale(terminology:eo) locale(terminology:es) locale(terminology:fi) locale(terminology:fr) locale(terminology:he) locale(terminology:hi) locale(terminology:hr) locale(terminology:id) locale(terminology:it) locale(terminology:ja) locale(terminology:ko) locale(terminology:ms) locale(terminology:nb_NO) locale(terminology:nl) locale(terminology:pl) locale(terminology:pt) locale(terminology:pt_BR) locale(terminology:ru) locale(terminology:si) locale(terminology:sl) locale(terminology:sr) locale(terminology:sv) locale(terminology:tr) locale(terminology:uk) locale(terminology:vi) locale(terminology:zh_Hans) terminology-lang terminology-lang-all"
RDEPENDS:${PN} += "terminology"

inherit rpm
