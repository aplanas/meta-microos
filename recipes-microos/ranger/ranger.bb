SUMMARY = "Console File Manager"
DESCRIPTION = "Ranger is a console file manager that gives you greater flexibility and a \
good overview of your files without having to leave your text console. It \
visualizes the directory tree in two dimensions: the directory hierarchy on \
one, lists of files on the other, with a preview to the right. \
 \
The default keys are similar to those of Vim, Emacs and Midnight Commander, \
though ranger is easily controllable with just the arrow keys or the mouse."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.3+git20230416.478d5b6"

RPM_NAME = "ranger-1.9.3+git20230416.478d5b6-2.1.noarch.rpm"
RPM_HASH = "5608f7411c0e3006fa9f116267cecb3c52502dcfb4cc981765b41c4564eea7c7caeb9d15f80d8d8f3eedefc1b0a07fe8bbab00a7c2a7dd958aacbb7f9b93ac0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(ranger.desktop) \
mimehandler(inode/directory) \
python3.10dist(ranger-fm) \
python3dist(ranger-fm) \
ranger"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
file \
python(abi) \
python3-curses"

inherit rpm
