SUMMARY = "A spellchecker with grouping support"
DESCRIPTION = "mwic is a spell-checker that groups possible misspellings and shows \
them in their contexts. This is useful for checking technical \
documents that often contain words that are not included in standard \
dictionaries."
LICENSE = "MIT"

PV = "0.7.9"

RPM_NAME = "mwic-0.7.9-1.2.noarch.rpm"
RPM_HASH = "8f8b827e77f7f89e0e777eb0ac5f4b666148b66f4be84e9566a2aad7bb1966beb2ceafd2f2ce3fa7a95641db6c1df45180bd3b7a23c8385d5b437b53e95f84db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mwic"
RDEPENDS:${PN} += "/usr/bin/python3 python3-pyenchant python3-regex"

inherit rpm
