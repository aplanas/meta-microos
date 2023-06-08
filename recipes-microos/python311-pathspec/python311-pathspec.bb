SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python311-pathspec-0.11.1-2.1.noarch.rpm"
RPM_HASH = "1d244cd5ab488fd17a4b6c3dfe1ff5e7666a92205abe723b7a263db6376a372cfd34528acd7559fdbc4c3911b5ee1d0c40fca63445ded970e984c36fc9fc6f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pathspec) python311-pathspec python3dist(pathspec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
