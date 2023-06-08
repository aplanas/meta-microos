SUMMARY = "Version-bump software with a single command"
DESCRIPTION = "A command line tool handling the release process of software by updating all \
version strings in the source code by the correct increment. Also creates \
commits and tags. Version formats are configurable' works without any VCS, but \
can read tag information from and writes commits and tags to Git and Mercurial \
if available; handles text files, so it's not specific to any programming \
language. \
 \
This package obsoletes bumpversion."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python3-bump2version-1.0.1-2.3.noarch.rpm"
RPM_HASH = "ae177865e97a6e69cf44b8514c269be28e2f53e6322c5660477fb34b7033bbbf9534ed9d96c84790036b2bbd33936d7fc6a562b3d9f1a3b35ff2e5919a3c2086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bump2version python3.10dist(bump2version) python3dist(bump2version)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) update-alternatives"

inherit rpm
