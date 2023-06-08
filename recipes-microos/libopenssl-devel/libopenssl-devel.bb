SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "libopenssl-devel-3.0.8-1.3.noarch.rpm"
RPM_HASH = "077188fadb820896c6861917c3e69d9e13df5ca2a077a1ccdc1719d6d00aa87c387d0874e5b9c67e4c5359d5d9fb49f505d595b0f4fac417d382bc0db75b8f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenssl-devel openssl-devel pkgconfig(libcrypto) pkgconfig(libopenssl) pkgconfig(libssl) pkgconfig(openssl)"
RDEPENDS:${PN} += "libopenssl-3-devel libopenssl3 openssl pkgconfig"

inherit rpm
