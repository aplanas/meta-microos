SUMMARY = "openSUSE MicroOS defaults"
DESCRIPTION = "This provides default packages for openSUSE MicroOS which can be optionally \
replaced by alternatives."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-defaults-5.0-69.1.aarch64.rpm"
RPM_HASH = "5bd754964f3f51ec1b68225e45e60369c4725c53bb7b8ee1f76af1f9dfd88adc41c1e1268bed410d0dade8f3aaee83259b52a9598f51cece4a08d11cb0506e34"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-defaults patterns-microos-defaults(aarch-64)"
RDEPENDS:${PN} += "audit pattern() systemd-coredump"

inherit rpm
