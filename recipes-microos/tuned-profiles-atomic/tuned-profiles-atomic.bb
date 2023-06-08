SUMMARY = "Additional tuned profiles targeted to Atomic"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Atomic host and guest."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-atomic-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "6fac10427bb57687c96e3379fc78206f57fa3cb93142ed94fac3d3058603bce4b62bf821ee7d144d728d9af475ecf530a1ce159f57798cbd0e2a46ee7cd42afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-atomic"
RDEPENDS:${PN} += "tuned"

inherit rpm
