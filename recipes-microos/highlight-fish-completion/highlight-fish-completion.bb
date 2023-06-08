SUMMARY = "Fish completion for highlight"
DESCRIPTION = "This package provides Fish command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-fish-completion-4.5-1.3.noarch.rpm"
RPM_HASH = "42db56b598366c4895fb45a4c8e8660e115f02e279922e500704fdccc81f46f37f15540c689076e45d7e73ed0ee0fbb40897bd0c16def4359bbcfe004d2e700b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-fish-completion"
RDEPENDS:${PN} += "fish highlight"

inherit rpm
