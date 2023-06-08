SUMMARY = "Severed fonts for texlive-lilyglyphs"
DESCRIPTION = "The  separated fonts package for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-fonts-2023.201.0.0.2.4svn56473-54.1.noarch.rpm"
RPM_HASH = "b6fbaec1b730873244091308fb8d55261f45ca3e4bd8c14bbbf591ec65e8ba3d18d63a5a3675687b43884952f2258419bc18b52d177b04806a5eb3669aca26dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(emmentaler-11) font(emmentaler-13) font(emmentaler-14) font(emmentaler-16) font(emmentaler-18) font(emmentaler-20) font(emmentaler-23) font(emmentaler-26) font(emmentaler-brace) texlive-lilyglyphs-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
