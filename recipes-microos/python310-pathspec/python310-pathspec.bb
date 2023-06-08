SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python310-pathspec-0.11.1-2.1.noarch.rpm"
RPM_HASH = "4d21641ff7b389777102947efecb1e160e1578813859e77e910f32098f3b556e0e93070a486c7c7c2ab0a6106f3e1802ce7296bdd03a3a3a555af79f04807370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathspec python3.10dist(pathspec) python310-pathspec python3dist(pathspec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
