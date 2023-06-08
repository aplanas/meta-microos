SUMMARY = "SDK for the Jameica framework"
DESCRIPTION = "Source code required to build and develop Jameica plugins."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-devel-2.10.4-1.1.noarch.rpm"
RPM_HASH = "1472ec5b15e88713dbabdd6eae970f23cc258ead02fe21fb3aa8cdab96f4f9a06925bf7f57db40f10d3e6dede96806047d84ff6bede1372f658c4c3342b5702e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-devel"
RDEPENDS:${PN} += "jameica"

inherit rpm
