SUMMARY = "Obsolete system groups"
DESCRIPTION = "This package provides some obsolete system groups."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-obsolete-20170617-24.14.noarch.rpm"
RPM_HASH = "50d174ffc87bc2ff3b9ae81553e4a838c710c02b1a3bab3cf0cda9c37d4300c5e3072c3472e45272d0ed37b55f17c034dfab6e41bfe7ae2de096a45eb07d94c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(console) group(floppy) group(modem) group(public) group(sys) group(xok) system-group-obsolete"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
