SUMMARY = "OpenICC Data with all ICC profiles and targets"
DESCRIPTION = "The meta package installs all ICC profiles from the OpenICC Data collection."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-all-1.2-16.21.noarch.rpm"
RPM_HASH = "0703907ddb3cbad8705e57e4f3d282f2e8b61034256e54f35c52991299451d3e50baa1fd0fd0cdf428a5ab7e0d81dc0dca86df5e8aab7446a0f8ab453a20472a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-all"
RDEPENDS:${PN} += "icc-profiles \
icc-profiles-basiccolor-printing2009-extra \
icc-profiles-oyranos-extra"

inherit rpm
