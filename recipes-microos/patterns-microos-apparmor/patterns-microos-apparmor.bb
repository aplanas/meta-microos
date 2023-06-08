SUMMARY = "Apparmor Support"
DESCRIPTION = "Packages required to enable Apparmor on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-apparmor-5.0-69.1.aarch64.rpm"
RPM_HASH = "831a032f6799d3f146d38360fc2cd14883446a38c2c7eb2e4a8ace2aba17c732147f771374ce21b0e15de30656f26b3e8b27c39bd4c19dc819f5867c6088fee0"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-apparmor patterns-microos-apparmor(aarch-64)"
RDEPENDS:${PN} += "apparmor-parser apparmor-profiles"

inherit rpm
