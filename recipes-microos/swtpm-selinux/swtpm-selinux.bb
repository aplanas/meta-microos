SUMMARY = "SELinux module for the Software TPM emulator"
DESCRIPTION = "This package provides the SELinux module for the Software TPM emulator."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-selinux-0.8.0-3.1.noarch.rpm"
RPM_HASH = "ab858b827d076c64a114e1a2e5e6bf359d21e9f44cafc2fcdbca8ed7bbc2de4698f19fcfc6257a064379988a83b1d8967adfd9a46c52752b4ccd7dbc82cce30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtpm-selinux"
RDEPENDS:${PN} += "/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
swtpm"

inherit rpm
