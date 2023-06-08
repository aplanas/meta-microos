SUMMARY = "A sendto integration for Nemo"
DESCRIPTION = "This package add sendto integration for Nemo."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "nemo-extension-sendto-blueman-2.3.5-1.3.noarch.rpm"
RPM_HASH = "e9d0cbb324c7dc0f911ff52c5443a0f8204220d72fea65d09a60181e9b050cd5e49e6875cc03a0dea06146a0bffec63868afe008d7acacdb900d1ff8ccefa068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-sendto-blueman"
RDEPENDS:${PN} += "blueman typelib(GObject) typelib(Gio) typelib(Nemo)"

inherit rpm
