SUMMARY = "SELinux policy sandbox"
DESCRIPTION = "SELinux sandbox policy used for the policycoreutils-sandbox package"
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-sandbox-20230425-1.1.noarch.rpm"
RPM_HASH = "16031a345a5615808ca4b1bee8f5c5f4d88eb3d7e74cac81810a1be51efd2cea4745c606e2d3c2c582aa788909dd8c3d428cf4b7b9eba7677c24c0f87b42024c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-sandbox"
RDEPENDS:${PN} += "/bin/sh \
selinux-policy-targeted"

inherit rpm
