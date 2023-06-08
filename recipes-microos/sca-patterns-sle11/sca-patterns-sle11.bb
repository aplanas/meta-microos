SUMMARY = "Supportconfig Analysis Patterns for SLE11"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE11 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "sca-patterns-sle11-1.5.2-1.2.noarch.rpm"
RPM_HASH = "427ef99c0010fe3fa3d14a25c41063a30cecba10781b97cf01b70d16a9b8ba68dfe268980b03a03f3aaa0aa4b9ed35a2040cc6b80dd00348e4b67b76ee462b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle11"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/python3 sca-patterns-base"

inherit rpm
