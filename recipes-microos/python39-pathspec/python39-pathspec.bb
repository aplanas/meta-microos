SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python39-pathspec-0.11.1-2.1.noarch.rpm"
RPM_HASH = "7e8c4b3f6d3ff50e153bc69a7fa196af4494b9ad77d0913d08cb76a527a5e01765d203aa9facbfca9198a34c591443d1b9454e74a22c5b1d7a991bf9450d32b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pathspec) python39-pathspec python3dist(pathspec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
