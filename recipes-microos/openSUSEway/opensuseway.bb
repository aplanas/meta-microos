SUMMARY = "The openSUSEway desktop environment meta package"
DESCRIPTION = "This meta package aggregates openSUSEway desktop enviroment packages."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "openSUSEway-0.15.1-1.1.noarch.rpm"
RPM_HASH = "a27705506bb70671a17a6f10d47663c8fe766f449bdd1d9b4851cc210f5c69fd250e6ce0a76fd82b911681765e5f1ed9ad95afad94ed7e868e6d6fabaef03737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(openSUSEway) openSUSEway"
RDEPENDS:${PN} += "(gtkgreet or wlgreet) /bin/sh NetworkManager aaa_base bzip2 clipman command-not-found curl gfxboot-branding-openSUSE git greetd grep gzip jq less mpris-ctl pipewire sudo sway-branding-openSUSE sway-marker tar waybar-branding-openSUSE wget wl-clipboard xdg-desktop-portal xdg-desktop-portal-wlr xdg-utils"

inherit rpm
