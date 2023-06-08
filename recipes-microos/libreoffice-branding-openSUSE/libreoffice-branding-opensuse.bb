SUMMARY = "openSUSE Tumbleweed branding for LibreOffice"
DESCRIPTION = "openSUSE Tumbleweed branding for LibreOffice"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "libreoffice-branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "0965fad2f8024f7f7e74b987a5ccc1143d3377454c9186affbd9dbba90518f17be159dc22222126c75f94477dc6427502da8b7459eb2387d3c7cb8850990b1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding libreoffice-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
