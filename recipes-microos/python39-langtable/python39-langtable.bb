SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python39-langtable-0.0.61-1.3.noarch.rpm"
RPM_HASH = "840914c0111a8683a2b10492cf2f7eb15e5f3ae0737a3ce22137befebb20957fece56b652de49d0df79290ad8196cc8aa865f887b0f89ac8c701e18d58dae8e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(langtable) python39-langtable python3dist(langtable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
