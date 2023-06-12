SUMMARY = "Bold Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-bold-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "b2daca3f011fa2e1cb159e65e476922ebb41bbecda99ba48e96680aad407d72aafbc82ed9f438929d3424fd3f294b2fe8d9fc62ea65de0b6d63fe232a49fbe52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic_Bold \
ipa-gothic-bold-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
