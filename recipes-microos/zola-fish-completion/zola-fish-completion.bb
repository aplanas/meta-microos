SUMMARY = "Fish Completion for zola"
DESCRIPTION = "Fish command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-fish-completion-0.17.2-2.1.noarch.rpm"
RPM_HASH = "ac3349277d413f3358f6682c96f4581b479046ce915210b0780a0a300bc3bcf04fec5d4ba16336e4410d12089e6d39debe132be132453f087c06aa05bfe7c8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
