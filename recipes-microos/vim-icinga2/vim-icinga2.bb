SUMMARY = "Vim syntax highlighting for icinga2"
DESCRIPTION = "Provides Vim syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "vim-icinga2-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "bc204f9b089355687e45b03d9cdcdd7a1a4a92da620ea0f8657cae15d0f5ba48b8acd2445dcfeff197bf71c168f6a059b37b66dcd717b2071b571041388886dd"

RPROVIDES:${PN} += "vim-icinga2 vim-icinga2(aarch-64)"
RDEPENDS:${PN} += "vim"

inherit rpm
