SUMMARY = "Vim color schemes selection"
DESCRIPTION = "Selection of vim color schemes based on Colors Sample Pack - \
http://www.vim.org/scripts/script.php?script_id=625."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "vim-plugin-colorschemes-1.0-55.1.noarch.rpm"
RPM_HASH = "b758d1978773f3bd8bf24e7f3670849b4302276bf5e28d09c9bee0db71c352bb9691355d2ade909899e8bb6c11e0c84907804560ea30c8c0ef3ea30cadf826eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorschemes"
RDEPENDS:${PN} += "vim"

inherit rpm
