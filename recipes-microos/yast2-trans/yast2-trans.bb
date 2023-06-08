SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "eba3cd11807bae6ec8b3103b132d81beb32b5820f35b412df4c42573a4cfbad3ff392cc4be6d1fb21dbac1022b7bf2ec64a7c6e14b40e7175755c19754f12634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"
RDEPENDS:${PN} += ""

inherit rpm
