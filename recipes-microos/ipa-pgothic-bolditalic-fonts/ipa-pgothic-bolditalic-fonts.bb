SUMMARY = "Bold+Italic Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold+Italic variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-bolditalic-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "30a607b9526e8bb816d587080722139b5758956d7ce84be8a204d79692c27b4bb05744df9fa6a268c1f28c1d8c4f889be4027fd454b0190e69f9902dcbb9caa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic_BoldItalic \
ipa-pgothic-bolditalic-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
