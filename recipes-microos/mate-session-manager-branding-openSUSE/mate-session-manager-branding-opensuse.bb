SUMMARY = "openSUSE Branding of mate-session-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Session Manager."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-session-manager-branding-openSUSE-42.1-5.3.noarch.rpm"
RPM_HASH = "8b169c3643838dea6dd662972deb230992e3c11a57d3ee5fd22fd50b2c9001245d1d45e59f747442563a4fac2bbbc68ea7dabb27a581fcc597e6ed9ffa4f4998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-session-manager-branding-openSUSE) mate-session-manager-branding mate-session-manager-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh mate-icon-theme mate-session-manager metatheme-numix-common wallpaper-branding-openSUSE"

inherit rpm
