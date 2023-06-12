SUMMARY = "SELinux targeted base policy"
DESCRIPTION = "SELinux Reference policy targeted base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-targeted-20230425-1.1.noarch.rpm"
RPM_HASH = "c982e6c66dfe6fe840a390d5825e2ce3217378ba6cec22e0b695257a8a5a1123be8a44f6f4bf12d9bee13519d3e3583c3a54d516c8decd93c1f7f0071d01eb7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(selinux-policy-targeted) \
selinux-policy-base \
selinux-policy-targeted"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
selinux-policy"

inherit rpm
