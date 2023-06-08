SUMMARY = "Severed fonts for texlive-figbas"
DESCRIPTION = "The  separated fonts package for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn28943"

RPM_NAME = "texlive-figbas-fonts-2023.201.1.0.3svn28943-52.1.noarch.rpm"
RPM_HASH = "4d472f4c6b918f88246dc1eff692143d9cfa9ca9b02f7b60cdfcfb96c9ac9e271d3f2a6bf36d62fb7e1ce4d98fcdffe20d8d1934e44c831d3fca2eaebb819913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(computermodern) font(texpalladiol) texlive-figbas-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
