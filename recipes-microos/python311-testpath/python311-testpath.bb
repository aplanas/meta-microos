SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python311-testpath-0.6.0-2.1.noarch.rpm"
RPM_HASH = "039ad2a9414ad7f82b8c080edf60e635f684541f60cc523bc1dee5a679fa45b96f2f05161b0aad2a01a45b8bbdf061ec5f6a2026629358fd2f5b64bd54b76ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testpath) python311-testpath python3dist(testpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
