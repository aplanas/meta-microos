SUMMARY = "The openSUSEway desktop environment meta package"
DESCRIPTION = "This meta package aggregates openSUSEway desktop enviroment packages."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "openSUSEway-0.15.2-1.1.noarch.rpm"
RPM_HASH = "02f42107436c80e9300acf4bef17001a9bf6921d32d21de81519c873a430cc1d8163150927562b588b83f9e20315fb32554e34836031e336195d3ad9a174690b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(openSUSEway) openSUSEway"
RDEPENDS:${PN} += "(gtkgreet or wlgreet) /bin/sh NetworkManager aaa_base bzip2 clipman command-not-found curl gfxboot-branding-openSUSE git greetd grep gzip jq less mpris-ctl pipewire sudo sway-branding-openSUSE sway-marker tar waybar-branding-openSUSE wget wl-clipboard xdg-desktop-portal xdg-desktop-portal-wlr xdg-utils"

inherit rpm
