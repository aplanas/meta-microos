SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python39-autocommand-2.2.2-2.1.noarch.rpm"
RPM_HASH = "a5da1d9649cd4ab436537bbfc0a6c7d42529b39a2df9fe276345f8b81e1fcc39b3b9cddae0d230f94d8e9b49f8a55ed9d9a0f7bf2b07bc137af84f3a17a4c114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autocommand) python39-autocommand python3dist(autocommand)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
