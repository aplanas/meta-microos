SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python311-langtable-0.0.61-2.1.noarch.rpm"
RPM_HASH = "6a1eb61a8e7bcb8476ebc715d5558399d4f3205a5c4fa4cdc05f9c63f39a10c1ef500c0ec9cc5b5ee0edde0430fbd286ae37a86d519f9e0d379cd344ed4e11e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(langtable) python311-langtable python3dist(langtable)"
RDEPENDS:${PN} += "python(abi) python-langtable-data"

inherit rpm
