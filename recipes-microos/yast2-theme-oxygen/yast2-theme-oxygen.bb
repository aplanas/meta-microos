SUMMARY = "YaST2 - Oxygen icon theme"
DESCRIPTION = "Contains icons in KDE Oxygen style (from KDE Plasma 4)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-oxygen-4.6.0-1.1.noarch.rpm"
RPM_HASH = "36fbf6437b8af4da20255e480e4d2da3d4dde9293e285b697eeba9a3ebb108755cb0aea5f96b9828410a6a0138b8015da2f8a97b2b78f2771324025f280f92e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-oxygen"
RDEPENDS:${PN} += "oxygen5-icon-theme \
yast2-branding"

inherit rpm
