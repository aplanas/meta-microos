SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2023.20230311.svn55132-89.1.aarch64.rpm"
RPM_HASH = "ff772d95383f5ef54db6aa24994efaa8cbad778873b952d645bcdb606b928ebf6dda6a0a13f4cf1e2213e69b90f506ab427ba84b82c7ce5f27069b3b24a15c6c"

RPROVIDES:${PN} += "texlive-tikztosvg-bin texlive-tikztosvg-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm
