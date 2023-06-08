SUMMARY = "Common Gataway Interface for Octave"
DESCRIPTION = "Common Gateway Interface for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "0.1.2"

RPM_NAME = "octave-forge-cgi-0.1.2-1.14.noarch.rpm"
RPM_HASH = "c6ad59564392a953cafb91445123678c69e37ff8043458b79a542a02314017c5d4aa9d9f31970ebaf4bd42844ddf7a5ddca423427b7c10001caed937b935b9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-cgi"
RDEPENDS:${PN} += "/bin/sh octave-cli"

inherit rpm
