SUMMARY = "Big Japanese Fonts for the X Window System"
DESCRIPTION = "Big Japanese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-japanese-big-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "13d26cc7cbf0c481c484b8e64417a1482479bf00a6f8e0766a6a700ec064de58ea3c30d15aa968d74ba1c21562c57bfbfb24fe07891e41fedf05468ca0511b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntjapb intlfonts-japanese-big-bitmap-fonts locale(xorg-x11:ja)"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
