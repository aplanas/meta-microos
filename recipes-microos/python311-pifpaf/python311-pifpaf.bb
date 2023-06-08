SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python311-pifpaf-3.1.5-2.4.noarch.rpm"
RPM_HASH = "369e0d694a4d898055ca5bffeb904f67675bb0d5170d89215b7fceeec692e75155edb386adeee9cc99249351050a657ab98d77fc4e20f9c9cde8bd6b2bba4b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pifpaf) python311-pifpaf python3dist(pifpaf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-click python311-daiquiri python311-fixtures python311-psutil python311-requests python311-testrepository python311-testtools python311-xattr update-alternatives"

inherit rpm
