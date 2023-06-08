SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python39-Glances-3.3.1-1.1.noarch.rpm"
RPM_HASH = "b1f7f05740e08280bab2bb0b4fc6277618809319b344eb50c796c3738581be228b4cbd84bcf2f290ff44ec06683e34f19598e4ef5879d0139441b315c499ba97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances python3.9dist(glances) python39-Glances python39-glances python3dist(glances)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-bottle python39-defusedxml python39-future python39-psutil python39-requests python39-ujson update-alternatives"

inherit rpm
