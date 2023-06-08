SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29036"

RPM_NAME = "texlive-arara-bin-2023.20230311.svn29036-89.1.aarch64.rpm"
RPM_HASH = "771d54ea89b185a8868667ac047100ae9706042b85f4260b5a188667e66becf116be351eefea03c7adbdaa3ab9cdea0826ef40c422897389e26ed85c6dc52ee4"

RPROVIDES:${PN} += "texlive-arara-bin texlive-arara-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-arara"

inherit rpm
