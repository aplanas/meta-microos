SUMMARY = "Additional data for the qalculator calulator library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This provides definitions of additional units, functions, etc. on top \
of the built-in ones."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-data-4.6.1-1.1.noarch.rpm"
RPM_HASH = "9f162d31291ab0a3007df3d6e3e809e1cd2069438c575f1733bd2780328591dd337eaa0e4c85d968b120ce79ce4a0f4025117ba505877a1e0d9a0c61448acba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qalculate-data qalculate:/usr/share/qalculate/units.xml"
RDEPENDS:${PN} += "libqalculate"

inherit rpm
