SUMMARY = "Apparently run a function in a higher stack frame"
DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is \
just to fool caller(). All the really naughty bits of Tcl's uplevel() \
are avoided."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.2800"

RPM_NAME = "perl-Sub-Uplevel-0.2800-1.16.noarch.rpm"
RPM_HASH = "cd563f96348cbbb4e23a84419c30b3d22de2d832e64c422c5f42566561c10ed62f355164b2956bb0afacdd60f05cb61051f02eae65050767e41b9adc1e1bcab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DB) perl(Sub::Uplevel) perl-Sub-Uplevel"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
