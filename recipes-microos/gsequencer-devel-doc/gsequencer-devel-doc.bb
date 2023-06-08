SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "4.5.5"

RPM_NAME = "gsequencer-devel-doc-4.5.5-1.1.noarch.rpm"
RPM_HASH = "0436af448c30b866d5a85abe2a24228e46e6a590f3db28ed1ea7a9e011a08776560c0d43472b708b4fffd8101160ec17ee86400cad0c2f7396df345a5b5a83fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
