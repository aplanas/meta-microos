SUMMARY = "SELinux policy core python3 interfaces"
DESCRIPTION = "The python-policycoreutils package contains the interfaces that can be used \
by python in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "python3-policycoreutils-3.5-1.4.noarch.rpm"
RPM_HASH = "08aa3e86264eb1c9ad85c262f1581104c16c08db9d167b6da032200df04604fa5c016a941a281d6b94493c92bbcf7f23cf5ffc3b04c181fa5f62caf755fdf00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python python3-policycoreutils python3.10dist(sepolicy) python3dist(sepolicy)"
RDEPENDS:${PN} += "checkpolicy policycoreutils python(abi) python3-audit python3-selinux python3-semanage python3-setools python3-setuptools"

inherit rpm
