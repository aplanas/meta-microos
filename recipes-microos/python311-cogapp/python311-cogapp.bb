SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-cogapp-3.3.0-1.4.noarch.rpm"
RPM_HASH = "5581ce1ec2a55b009a06dc946ea936182e0303de0cbeca6d28cef98c5b09a2a18cf82486584f3be3c9ac5764202503e9b44b5452a5dee193b260c6c8159fb276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cogapp) python311-cogapp python3dist(cogapp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
