SUMMARY = "Translations for package picplanner"
DESCRIPTION = "Provides translations for the 'picplanner' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "picplanner-lang-0.4.0-1.1.noarch.rpm"
RPM_HASH = "d956ab2cc201eb3ef2969c91dbdb44f591d2d407d05e83ee441136da35882c7626d62595d5794de00570188e247c4e0af95f388d2d13363bab161ef01bc83126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(picplanner:de) picplanner-lang picplanner-lang-all"
RDEPENDS:${PN} += "picplanner"

inherit rpm
