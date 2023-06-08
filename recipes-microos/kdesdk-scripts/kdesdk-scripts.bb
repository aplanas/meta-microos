SUMMARY = "Scripts for KDE software development"
DESCRIPTION = "This package contains scripts useful for development of KDE software."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kdesdk-scripts-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6e9a4985af1eefbcb7b8a3b1cd20587bfb3a278c4caac87416585ec8292af447e2935e3130f51aa02413c4d212631d55a5d0c19cc76e18da26e164a38ca73691"

RPROVIDES:${PN} += "kde-dev-scripts kdesdk-scripts kdesdk-scripts(aarch-64) kdesdk4-scripts"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/perl"

inherit rpm
