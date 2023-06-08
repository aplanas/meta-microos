SUMMARY = "openSUSE MicroOS Base System (alias pattern for microos_base)"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-basesystem-5.0-69.1.aarch64.rpm"
RPM_HASH = "85e100c3056523ef14939658034aab4be1d9349ad0a1e0cb74d86b5ad33f848750842de8f41e6e03501a01e88070f9726397bf3c6ea501ffdb691510443c75bf"

RPROVIDES:${PN} += "pattern() pattern-icon() patterns-microos-basesystem patterns-microos-basesystem(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
