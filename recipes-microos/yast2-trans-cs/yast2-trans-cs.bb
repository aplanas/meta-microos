SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-cs-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "9e562a14e19f1f7289d4f9c077031ed8a7e1cc64ea3fc30cb42dac0d3f99df2779b933b4e51d51c497a151f0ca7ea02cf5dd3aae916a6ac41445e30bbb3b7c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:cs) \
yast2-trans-cs"
RDEPENDS:${PN} += ""

inherit rpm
