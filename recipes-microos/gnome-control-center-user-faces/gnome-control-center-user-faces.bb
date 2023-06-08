SUMMARY = "Login manager user avatars"
DESCRIPTION = "This package provides user avatars to be used by display managers"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-control-center-user-faces-44.1-1.1.noarch.rpm"
RPM_HASH = "761c8217db3f7eb405b3166bce15d983ea648299052634396783336a98d7e439369714afd6830e18266b0b0ff3e734b338f4a8bf159f74dc9155fc6e9eb4bf79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-user-faces"
RDEPENDS:${PN} += ""

inherit rpm
