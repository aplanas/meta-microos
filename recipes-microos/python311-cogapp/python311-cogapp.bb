SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-cogapp-3.3.0-2.1.noarch.rpm"
RPM_HASH = "5d5777b599f86e5a3b883ac7043aaa9b7eb9fa540cf674c895633eae6d53df3b7bee863cf6a0226683c6137316ab037054b87024331da5da34e67dc1397f0711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cogapp) python311-cogapp python3dist(cogapp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
