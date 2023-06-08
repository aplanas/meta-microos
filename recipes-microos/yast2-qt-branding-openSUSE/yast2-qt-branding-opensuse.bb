SUMMARY = "openSUSE Tumbleweed branding for YaST2 Qt"
DESCRIPTION = "openSUSE Tumbleweed branding for YaST2 Qt, mainly used for installation"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "yast2-qt-branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "08e47b77485dad6fc1e72aa934ceec00e5be776a19c43f6d8d605f456cb0a97077d1425275324e8ba4c813b6652786ce963d7ba6f8318236a72a5ae6c3f29902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-qt-branding yast2-qt-branding-openSUSE"
RDEPENDS:${PN} += "adobe-sourcesans3-fonts distribution-logos google-opensans-fonts"

inherit rpm
