SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2023.20230311.svn32101-89.1.aarch64.rpm"
RPM_HASH = "bbf97cb0198e3d9712b03e30ca0df76ae74cfed247d6520e375246d0f5a98cbdd0aa0a703cc69f491197a90c4ec0e803df56faf5cf771bc152a6528d54e051ae"

RPROVIDES:${PN} += "texlive-kotex-utils-bin texlive-kotex-utils-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
