SUMMARY = "Fish Completion for hut"
DESCRIPTION = "The official fish completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-fish-completion-0.3.0-1.1.noarch.rpm"
RPM_HASH = "05efa666268c9f340467cbf7e4c37020f5979d8b14271cfaa19faed1a4387f237b7b3e1af7a6063c566d08c3b7160c2d62d99f9f1985cf1071c6a6f004013d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
