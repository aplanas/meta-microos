SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python310-langtable-0.0.61-1.3.noarch.rpm"
RPM_HASH = "10ed309557c0882b1f5cfba57e7574d903a3562f7b0c7047dc9c51480caae99c175e49c583738d0938f2317da9b51a8ec3748032b3546360266a9a7efbb69b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langtable python3.10dist(langtable) python310-langtable python3dist(langtable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
