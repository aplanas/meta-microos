SUMMARY = "Additional GNOME Themes"
DESCRIPTION = "This package contains several extra GNOME themes."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "2.22.0"

RPM_NAME = "gnome-themes-extras-2.22.0-79.7.noarch.rpm"
RPM_HASH = "dac5528c54bd1fceb82fc4e7db84e5e488592768b1bbc335d5ae806b51c2a7bfccda7e0d527249e1a4ee181bf14bdf4b51a0de213510c6db12cfd6df559f4fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-extras"
RDEPENDS:${PN} += "/bin/sh gnome-themes"

inherit rpm
