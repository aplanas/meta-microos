SUMMARY = "openSUSE MicroOS using Zypper"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Zypper package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-zypper-5.0-69.1.aarch64.rpm"
RPM_HASH = "f65511663f6e0a1be0642b7c858c5face721ed15c6566e84afd00ba1e19c03823cfda332319795f88bd9bc099da6d079e1b67dc84aa6de29f3ffa3fdba2e3fb3"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-base-zypper patterns-microos-base-zypper(aarch-64)"
RDEPENDS:${PN} += "pattern() transactional-update transactional-update-zypp-config zypper zypper-needs-restarting"

inherit rpm
