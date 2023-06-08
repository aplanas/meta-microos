SUMMARY = "openSUSE Branding of mate-desktop"
DESCRIPTION = "This package provides the openSUSE definition for MATE Desktop GSchemas."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-desktop-gschemas-branding-openSUSE-42.1-5.3.noarch.rpm"
RPM_HASH = "332a13865456d96e155a18ff2b0c3efe156185634591cc7d211d8f4e3a73b60147be89a0e061243f5807d03ab7fe8907ca54d521d3b775fcf2039ac214439e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding mate-desktop-gschemas-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh adwaita-icon-theme mate-desktop-gschemas"

inherit rpm
