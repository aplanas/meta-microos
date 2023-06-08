SUMMARY = "Generates an issue files from different snippets"
DESCRIPTION = "issue-generator is a tool to create an issue file dynamically."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "issue-generator-1.13-1.6.noarch.rpm"
RPM_HASH = "bd99c8580bf97cbea91aca4a4628783e5f168f155725ee11612b56939e633490f997db06347d892f48361bbf2ed9fa7ba6520e48c6f7576ef69c872ae69d9c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "issue-generator"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup"

inherit rpm
