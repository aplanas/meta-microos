SUMMARY = "SELinux policy module for k3s"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for k3s."
LICENSE = "Apache-2.0"

PV = "1.3.stable.1"

RPM_NAME = "k3s-selinux-1.3.stable.1-1.1.noarch.rpm"
RPM_HASH = "a07aa1947b40c2eb9da2c776754ae78dd70ca7560d375d0e339f38dfe06bca3f7d0475355c2c951304018a6e1bef14f9525f368c7dd9652341373c9877056d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k3s-selinux"
RDEPENDS:${PN} += "/bin/sh container-selinux policycoreutils selinux-policy-base selinux-tools"

inherit rpm
