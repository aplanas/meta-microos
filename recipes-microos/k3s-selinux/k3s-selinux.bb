SUMMARY = "SELinux policy module for k3s"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for k3s."
LICENSE = "Apache-2.0"

PV = "1.2.stable.2"

RPM_NAME = "k3s-selinux-1.2.stable.2-1.3.noarch.rpm"
RPM_HASH = "f39d49eb9924110189ab3d42a3b35762f85f08930186ba4fbddc00ede983f23e7a215daa98954e064bf933cfba79827448d1d4532adfd31bed284b0e1d1750e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k3s-selinux"
RDEPENDS:${PN} += "/bin/sh container-selinux policycoreutils selinux-policy-base selinux-tools"

inherit rpm
