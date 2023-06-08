SUMMARY = "Fetches system/theme information in terminal for Linux desktop screenshots"
DESCRIPTION = "screenFetch is a 'Bash Screenshot Information Tool'. This handy Bash \
script can be used to generate one of those nifty terminal theme \
information + ASCII distribution logos you see in everyone's screenshots \
nowadays. It will auto-detect your distribution and display an ASCII \
version of that distribution's logo and some valuable information to the \
right. There are options to specify no ascii art, colors, taking a \
screenshot upon displaying info, and even customizing the screenshot \
command! This script is very easy to add to and can be easily extended."
LICENSE = "GPL-3.0-only"

PV = "3.9.1"

RPM_NAME = "screenfetch-3.9.1-1.10.noarch.rpm"
RPM_HASH = "cd5e76d93236e72a92058069d6cd9e5010a80bdb7f919b24b085c81ecebb35fc66fed4d50224642ec5b20884b63c0281369503359e023e217f84ce3189c52bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "screenfetch"
RDEPENDS:${PN} += "/bin/bash bc xprop"

inherit rpm
