SUMMARY = "Yet Another Dotfiles Manager"
DESCRIPTION = "yadm is a tool for managing a collection of files across multiple computers, \
using a shared Git repository. In addition, yadm provides a feature to select \
alternate versions of files based on the operation system or host name. Lastly, \
yadm supplies the ability to manage a subset of secure files, which are \
encrypted before they are included in the repository."
LICENSE = "GPL-3.0-only"

PV = "3.2.1"

RPM_NAME = "yadm-3.2.1-1.5.noarch.rpm"
RPM_HASH = "fa7cadbb7b6096f0d78f8e4ca32d532e53d5623082fc16c24925c5000e97e53eacce471cc001112fc8c6f577de88472edf7c229de8da3b6d4e460e349ebd1025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm"
RDEPENDS:${PN} += "/usr/bin/bash bash git"

inherit rpm
