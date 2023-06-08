SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python310-clint-0.5.1-5.3.noarch.rpm"
RPM_HASH = "cc5461a6466aefbee3d64d245db1c99c9e0b6a544910b0434a97bd1c6e5ce37d92786f65d6c114d9d62d0c3662d7bdbda5a633444ad428f2c0337453945423fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clint python3.10dist(clint) python310-clint python3dist(clint)"
RDEPENDS:${PN} += "python(abi) python310-args"

inherit rpm
