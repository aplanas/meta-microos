SUMMARY = "Frontend for git-grep and grep"
DESCRIPTION = "vgrep is a command-line tool to search textual patterns in directories. It \
serves as a frontend to grep and git-grep and allows to open the indexed \
matching lines in a user-specified editor. vgrep is inspired by the ancient \
cgvg scripts but extended to perform further operations such as listing \
statistics of files and directory trees or showing the context lines before and \
after the matches."
LICENSE = "GPL-3.0-only"

PV = "2.6.1"

RPM_NAME = "vgrep-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "f852b4ca83c177b11b7f157ebe07269a82abb8629c32b230c523a676f09f40eed9f941af94337a9c2e76f1cf408b6355feeabf0adce95541255fb50643a1d257"

RPROVIDES:${PN} += "vgrep \
vgrep(aarch-64)"
RDEPENDS:${PN} += "git-core \
grep"

inherit rpm
