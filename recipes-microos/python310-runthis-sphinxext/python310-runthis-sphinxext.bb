SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python310-runthis-sphinxext-0.0.3-1.12.noarch.rpm"
RPM_HASH = "4573e9cb88517a979a308f02230b7fd35fc4987bdb3f5e457a1add8277dd403ee2cd0ea4cb052ee0b92572943208c9cb146a312d1ad54132f4bc9502d000e9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-runthis-sphinxext python3.10dist(runthis-sphinxext) python310-runthis-sphinxext python3dist(runthis-sphinxext)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
