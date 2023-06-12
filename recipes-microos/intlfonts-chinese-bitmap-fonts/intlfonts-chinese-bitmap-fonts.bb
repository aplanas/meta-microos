SUMMARY = "Chinese Fonts for the X Window System"
DESCRIPTION = "Chinese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-chinese-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "a4184cde944c4ff8f5b4f171e3072be9b7e9c3de5ddd72e7e9a4d34715872e82891cda5c0898f8809cc5d48c68649cba57622692dcb50b39f73f3d2224b27369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntchia \
intlfonts-chinese-bitmap-fonts \
locale(xorg-x11:zh)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
