SUMMARY = "A plugin that allows for easy commenting of code for many filetypes"
DESCRIPTION = "The NERD commenter provides many different commenting operations and styles \
which may be invoked via key mappings and a commenting menu. These operations \
are available for most filetypes."
LICENSE = "WTFPL"

PV = "2.7.0"

RPM_NAME = "vim-plugin-NERDcommenter-2.7.0-55.1.noarch.rpm"
RPM_HASH = "5d2542e1e80a4b4d3ae68e4b5bdd18faa10a47433f49c7fe817ba8bceb6c59c2f74fb9220b6164970df8b3fc99fc565f052a36afff5202b5fe3496b65d736303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDcommenter"
RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm
