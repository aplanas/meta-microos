SUMMARY = "Titlesequences for openRCT2"
DESCRIPTION = "This package contains tilesequences like the original ones \
used in RollerCoaster Tycoon 1 and 2. \
When using RCT1 sequences, the original RCT1 files have to be installed."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "openrct2-titlesequences-0.4.3-2.1.noarch.rpm"
RPM_HASH = "3fb9810daccb17983800b029268db9f283d9b8ba3475b7ed68d4937b277696605fd26978577ba6102f34218e3327bbdb3c41db55913a6c60f9f0126f5ed91cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-titlesequences"
RDEPENDS:${PN} += "openrct2"

inherit rpm
