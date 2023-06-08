SUMMARY = "Severed fonts for texlive-fontawesome"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-fonts-2023.201.4.6.3.2svn48145-52.1.noarch.rpm"
RPM_HASH = "36cc8da59ae035dab0f3ac6bfe3c39bd1189360282f63c01efc60fca519274b14e0c1636b19375d15f9db3bb8a921fda36afea3a09ff70a549def455b547679b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-fontawesome-fonts) font(fontawesome) texlive-fontawesome-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
