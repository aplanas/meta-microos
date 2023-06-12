SUMMARY = "'Lanka Linux User Group' OpenType Font for Sinhala"
DESCRIPTION = "'Lanka Linux User Group' OpenType font for Sinhala copyright 2004 by \
Yannis Haralambous.  OTF tables added by Anuradha Ratnaweera an d \
Harshani Devadithya, and modified by Harshula Jayasuriya. 'Kunddaliya' \
glyph Copyright (c) 2006 Harshula Jayasuriya"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "lklug-fonts-0.6-120.17.noarch.rpm"
RPM_HASH = "5e6554120c0724fa3125c89dece5affe6c6248f815f906430dd3b91494b0ed00560f319c1de81059b1a36487349b7ca4c50f45463c8db8b0859decd566a3e049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lklug \
lklug-fonts \
locale(si) \
scalable-font-si"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
