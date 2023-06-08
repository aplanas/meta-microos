SUMMARY = "Old German Dictionary for MySpell"
DESCRIPTION = "This dictionary supports spell checking according to the old German spelling \
rules. \
 \
MySpell dictionaries are compatible with MySpell and Hunspell spell-checker. \
They are used by various desktop applications, for example, LibreOffice, \
Mozilla Thunderbird, and Mozilla Firefox."
LICENSE = "GPL-2.0+"

PV = "20030428"

RPM_NAME = "myspell-german-old-20030428-265.16.noarch.rpm"
RPM_HASH = "dbb479603afcbaaa24d5e40f781a4e415f3de497046326622191dbe8685ccf7d56da6184a4b27467c527f7f2559de4e50d3f3eb7cbdda1af695c1ecf96920cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "myspell-dictionary myspell-german-dictionary myspell-german-old"
RDEPENDS:${PN} += ""

inherit rpm
