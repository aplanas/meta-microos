SUMMARY = "Devhelp plugin for Vim"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Vim."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "vim-plugin-devhelp-43.0-2.1.aarch64.rpm"
RPM_HASH = "e8da2b8ed5340d894a30648965ca73cd14390887c69890a17b570c58d8b28485fac7505d7036345f7551d25992b5dc0e143ae037bc8f6852d9899350d9b3ef95"

RPROVIDES:${PN} += "vim-plugin-devhelp \
vim-plugin-devhelp(aarch-64)"
RDEPENDS:${PN} += "devhelp \
vim"

inherit rpm
