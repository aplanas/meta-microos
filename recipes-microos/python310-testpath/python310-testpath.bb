SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python310-testpath-0.6.0-2.1.noarch.rpm"
RPM_HASH = "de219a10b72a190035e53fbef63f54d83883a236be6052c5587f0f072587d9752bdea74d93a48e6971c33a5f5ce01f205d12a46c4c630c33d746e368a69e390c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testpath python3.10dist(testpath) python310-testpath python3dist(testpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
