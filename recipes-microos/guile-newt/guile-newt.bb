SUMMARY = "Guile bindings to Newt"
DESCRIPTION = "This package provides Guile bindings to Newt, a library for text based user \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "guile-newt-0.0.3-1.3.aarch64.rpm"
RPM_HASH = "62144959d9a2eac826bbae4d300beae5615d4ca192c910ed706fc0e15ed296767d1c71537477293cb8c6942b4e9b312dd5242b76d4476ea8cf02552f308b8f1e"

RPROVIDES:${PN} += "guile-newt \
guile-newt(aarch-64)"
RDEPENDS:${PN} += "guile \
newt-devel"

inherit rpm
