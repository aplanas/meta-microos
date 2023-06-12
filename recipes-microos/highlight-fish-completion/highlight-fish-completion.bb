SUMMARY = "Fish completion for highlight"
DESCRIPTION = "This package provides Fish command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-fish-completion-4.6-1.1.noarch.rpm"
RPM_HASH = "2bca1439c385d2014802ddc891c4f8f9d9d6318e2c0878a13f0d0f3f12cd158fc150052c109a9a77740de1405703deac20ae5d63c79e4cfd3cc93ed9a72b074e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-fish-completion"
RDEPENDS:${PN} += "fish \
highlight"

inherit rpm
