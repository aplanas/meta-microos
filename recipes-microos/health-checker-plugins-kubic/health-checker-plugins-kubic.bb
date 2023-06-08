SUMMARY = "Health-checker plugins for openSUSE Kubic"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE Kubic did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "health-checker-plugins-kubic-1.7-1.2.noarch.rpm"
RPM_HASH = "e6935b305e1bd65db04524980109146468c7feaca5c856965f489fb145cfd4da3b9157a396e0b3bfa066db7f4ac0ed562e8906e25ec23a741fdc648de56b34e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins health-checker-plugins-kubic"
RDEPENDS:${PN} += "/bin/bash health-checker"

inherit rpm
