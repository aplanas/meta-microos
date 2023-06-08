SUMMARY = "Severed fonts for texlive-pigpen"
DESCRIPTION = "The  separated fonts package for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-fonts-2023.201.0.0.2svn15878-51.1.noarch.rpm"
RPM_HASH = "1449d18f0608ee8e3054417bc415a98a6bddba962eeb1f97da09c2a41bab4b70572a167b6c233baf3e17706e6492c7a2cbc049fb3ba24d98f499666e22da83c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(pigpen) texlive-pigpen-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
