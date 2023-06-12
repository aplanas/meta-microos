SUMMARY = "Data files for the imake utility"
DESCRIPTION = "The xorg-cf-files package contains the data files for the imake utility, \
defining the known settings for a wide variety of platforms (many of \
which have not been verified or tested in over a decade), and for many \
of the libraries formerly delivered in the X.Org monolithic releases. \
 \
The X Window System used imake extensively up through the X11R6.9 \
release, for both full builds within the source tree and external \
software. X has since moved to GNU autoconf and automake for its build \
system in X11R7.0 and later releases, but still maintains imake for \
building existing external software programs that have not yet \
converted."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xorg-cf-files-1.0.8-1.1.noarch.rpm"
RPM_HASH = "ee6cef5fe75a12f7417bc057347fdba20afc3e12e8ed5c8910a013bf89e2f00fb7ee2ccc7e8d45a7a869e225b7ac48ac418a4e17c183fd8849af0c6f62ba4721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-cf-files"
RDEPENDS:${PN} += "gccmakedep \
imake \
makedepend"

inherit rpm
