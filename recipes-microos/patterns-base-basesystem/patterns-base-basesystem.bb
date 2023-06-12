SUMMARY = "Base System (alias pattern for base)"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basesystem-20200505-41.1.aarch64.rpm"
RPM_HASH = "8e039e763f0109c2fa94167cb897411f3703c6252aae9d0bd01e7e68f0054074bded545f70e13de8c8f8e8c10687c95e03fd929d9c39f5f1227b2f28426ab390"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
patterns-base-basesystem \
patterns-base-basesystem(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
