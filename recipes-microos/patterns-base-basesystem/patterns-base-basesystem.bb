SUMMARY = "Base System (alias pattern for base)"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basesystem-20200505-40.1.aarch64.rpm"
RPM_HASH = "64d0864813debbfc471881875e3f1eb16f5edc3aa09cc8b3a54d1d5e4939418cf261b6c69667d1789bfc6410c1850a72989130da8ded56118271dc5056d08838"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() patterns-base-basesystem patterns-base-basesystem(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
