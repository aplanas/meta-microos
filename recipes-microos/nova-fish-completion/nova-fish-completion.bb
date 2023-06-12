SUMMARY = "Fish Completion for nova"
DESCRIPTION = "Fish command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-fish-completion-3.6.5-1.1.noarch.rpm"
RPM_HASH = "a1a2190166a35964fde5838d4ea63612880fa0b0d33f4b7f43a0bccf3735675ce7b93b6dec97a773916d275a3b5501f68ccfcf595382b89dee2982b575fb17f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-fish-completion"
RDEPENDS:${PN} += "nova"

inherit rpm
