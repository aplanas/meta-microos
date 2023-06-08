SUMMARY = "A tree explorer plugin for navigating the filesystem"
DESCRIPTION = "The NERD tree allows you to explore your filesystem and to open files and \
directories. It presents the filesystem to you in the form of a tree which you \
manipulate with the keyboard and/or mouse. It also allows you to perform simple \
filesystem operations."
LICENSE = "WTFPL"

PV = "6.10.16"

RPM_NAME = "vim-plugin-NERDtree-6.10.16-55.1.noarch.rpm"
RPM_HASH = "cee77a0b921bbf7a81bf0d68d012c4723041f946f2981064046518fd05c6da938f73281ea712ad46b3d77827b7c48339776821394b39163e126b0073da080d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDtree"
RDEPENDS:${PN} += "/bin/sh vim"

inherit rpm
