SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-cogapp-3.3.0-1.4.noarch.rpm"
RPM_HASH = "d78ba02bddf51f5c35be123c9ed3bd655375671458319e06d1a9caffba14bb3e7bec9e82a97c11cf7809f94c5f0c7e6076573a5afdfafc7912532e741abcd819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cogapp python3.10dist(cogapp) python310-cogapp python3dist(cogapp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
