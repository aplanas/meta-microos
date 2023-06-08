SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2023.20230311.svn65625-89.1.aarch64.rpm"
RPM_HASH = "b4da596343dae588bb850da5dac6d36e0d12cdb707906f39d16e7bf2d07138feca080788701a1457d29b69f9385354e020c5e2260700773b46f931c61ad4064a"

RPROVIDES:${PN} += "texlive-pagelayout-bin texlive-pagelayout-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm
