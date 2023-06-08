SUMMARY = "openSUSE Branding of mate-control-center"
DESCRIPTION = "This package provides the openSUSE definition of what appears in the \
control centre."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-control-center-branding-openSUSE-42.1-5.3.noarch.rpm"
RPM_HASH = "1dd5df428dc60c4039ddb8d8f528b73e8bbf3f810fe78ed36cce9291320b5cd3f06cdd8878061b74d4a0ef9218b4dcd087b5798bb5cb0f9274ccb32cf672dfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-control-center-branding-openSUSE) mate-control-center-branding mate-control-center-branding-openSUSE"
RDEPENDS:${PN} += "mate-control-center"

inherit rpm
