SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50281"

RPM_NAME = "texlive-tpic2pdftex-bin-2023.20230311.svn50281-89.1.aarch64.rpm"
RPM_HASH = "5942a5fbd462038251729384c25a4271efba9eb709131ec81c2cdf07e285077b2f82498401e835ba99ddb0baf100850b02a5abeb3e69dc1423ecbb27addb0a5d"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin texlive-tpic2pdftex-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh texlive-tpic2pdftex"

inherit rpm
