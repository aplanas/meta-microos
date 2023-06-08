SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python311-langtable-0.0.61-1.3.noarch.rpm"
RPM_HASH = "c2889aefbf2ea69540b1cbcb7dc778b42cb2db55bd8e1c64541b012888df06143b4bcc76e6c20efc6ba0dbe335c6184421fc142f4a7a40358c52b097d9ab407c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(langtable) python311-langtable python3dist(langtable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
