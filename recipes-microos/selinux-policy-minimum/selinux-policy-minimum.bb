SUMMARY = "SELinux minimum base policy"
DESCRIPTION = "SELinux Reference policy minimum base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-minimum-20230425-1.1.noarch.rpm"
RPM_HASH = "dadef9a46ed5c388d29f539c26714fc225a0e1f69a1494fd53b41185f38538a8b813381db99601e98f4fe8c92b57ee4fb98e4f60a6871cce0d4edb4388131064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(selinux-policy-minimum) selinux-policy-base selinux-policy-minimum"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk coreutils policycoreutils policycoreutils-python-utils selinux-policy"

inherit rpm
