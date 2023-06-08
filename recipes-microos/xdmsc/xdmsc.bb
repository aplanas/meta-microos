SUMMARY = "XTerminal -- Use SUSE Linux as an X Terminal"
DESCRIPTION = "Some useful scripts for using SUSE Linux as an X terminal. \
 \
You will find the documentation in the following directory \
 \
/usr/share/doc/packages/xdmsc/"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "xdmsc-0.6-2.5.noarch.rpm"
RPM_HASH = "da7335bed91495225b6cc96826076c4cf69249b2dee952530b87547e1a070ba39ba48f817e6184177fb2702cbeb9975872688fdde25f351045c06a0681e981fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Xterminal xdmsc"
RDEPENDS:${PN} += "/bin/sh fillup"

inherit rpm
