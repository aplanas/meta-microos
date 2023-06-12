SUMMARY = "Edit file without entering the whole path"
DESCRIPTION = "This script uses slocate (or a similar application) to allow the user to open a \
file without having to enter a path. If multiple files are found the user is \
given the choice of which file to open. \
 \
Usage: \
  :LocateEdit somefile.txt \
  :LocateSplit somefile.txt \
  :LocateSource somefile.vim \
  :LocateRead somefile.txt"
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-locateopen-1.3-55.1.noarch.rpm"
RPM_HASH = "254f5840f03fa4081c3c3bc1184ec6fce6e37ce042e45aed6a15b3f438a5940a2326ffa3541f7f60f187b0e0d87495c19318c81a070e4e1c7dfe3fbcf13bebe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-locateopen"
RDEPENDS:${PN} += "findutils-locate \
vim"

inherit rpm
