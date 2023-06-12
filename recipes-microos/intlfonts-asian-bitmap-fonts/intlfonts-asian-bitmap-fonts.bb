SUMMARY = "Asian Fonts for the X Window System"
DESCRIPTION = "Asian fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-asian-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "683a1e027d50f693d30082d674487de59d0abdd71cb8b13d395413604463e2984bbbe7d22789affc7e910868054d77f2bc72b472e470339b18bac4d979bf3ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntasia \
intlfonts-asian-bitmap-fonts \
locale(xorg-x11:km;th;vi)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
