SUMMARY = "Python Command Line Interface Tools"
DESCRIPTION = "Clint is a module filled with a set of tools for developing \
commandline applications. It supports colors, and custom email-style \
quotes. It has a nestable indentation context manager, and a column \
printer with optional auto-expanding columns with autodetection of \
console size, wrapping your words properly to fit the column size."
LICENSE = "ISC"

PV = "0.5.1"

RPM_NAME = "python311-clint-0.5.1-5.3.noarch.rpm"
RPM_HASH = "3ed1402f8131b6270b1833781ec5abd7545cd36567f830940d3ce9d768146ea4d1aeceb0ef4c148048bdd1f0be51df2fa930ed07c5b844e7eb23a4074d96b3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(clint) python311-clint python3dist(clint)"
RDEPENDS:${PN} += "python(abi) python311-args"

inherit rpm
