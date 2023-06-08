SUMMARY = "Frontend for git-grep and grep"
DESCRIPTION = "vgrep is a command-line tool to search textual patterns in directories. It \
serves as a frontend to grep and git-grep and allows to open the indexed \
matching lines in a user-specified editor. vgrep is inspired by the ancient \
cgvg scripts but extended to perform further operations such as listing \
statistics of files and directory trees or showing the context lines before and \
after the matches."
LICENSE = "GPL-3.0-only"

PV = "2.6.1"

RPM_NAME = "vgrep-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "9759b7a367f3b8f0a7d7f922de1b8ac124942e10ca1ca763445aeaa5b3705455c183ac2cc5e32e320b5367cc51e987ec5fbace10723107dea373ac6c24e97e91"

RPROVIDES:${PN} += "vgrep vgrep(aarch-64)"
RDEPENDS:${PN} += "git-core grep"

inherit rpm
