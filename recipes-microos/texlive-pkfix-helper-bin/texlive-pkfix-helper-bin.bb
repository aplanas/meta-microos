SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "48c974d697d3f0609d845f77569365c64a22db64866f72ac082345b58245df21e0f28d6c84df22ffdd159f68e0429b6a0e9388d277eb39c0dabe453fae9e5410"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin texlive-pkfix-helper-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
