SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python310-xdg-5.1.1-1.4.noarch.rpm"
RPM_HASH = "3b123fac67184f4b555113716a6294e9a5c57b9bc64c83b7d9ab8a26b7f981a8850b1555ae8782c26090c3b0d56f03b3ddc0a0206925e61e19a96f9482e49250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdg python3.10dist(xdg) python310-xdg python3dist(xdg)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
