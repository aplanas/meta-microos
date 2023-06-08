SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-cogapp-3.3.0-1.4.noarch.rpm"
RPM_HASH = "d3465565f67537262b6f3d410a371ffc4d6bc83138b401b30265c0925819c76ac80f8b822b777464a66f95acb4625a8ecc17ab3d792b37711dbe760e761417e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cogapp) python39-cogapp python3dist(cogapp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
