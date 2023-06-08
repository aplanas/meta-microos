SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "801f87ccbf9a7cc4f770c5ceda19c0a180e47cb2ed4d18bb140b67246c8ed6f9b3fb50e418883f31142f85af4797042622532f0e1d52fc72fd6fff7603c489ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding plymouth-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
