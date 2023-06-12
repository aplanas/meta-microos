SUMMARY = "'Proportional Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Proportional Mincho' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-pmincho-fonts-003.03-8.15.noarch.rpm"
RPM_HASH = "ac509dd312061473c8164e93d588cb561e00c389f1b10c016f913814cd3e834c9cd8bfa31c7f6cf70c54c50da085e8aa676d8328fb2a2c65846b4b94be58e060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPMincho \
ipa-pmincho-fonts \
locale(ja) \
scalable-font-ja"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
