SUMMARY = "Icon Name Specification Mapping Script"
DESCRIPTION = "A script for creating a symlink mapping for deprecated icon names to \
the new icon naming specification names for desktop icon themes."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.90"

RPM_NAME = "icon-naming-utils-0.8.90-23.12.noarch.rpm"
RPM_HASH = "36f1d0c0c32725a8f3caa9c527f07d760a8ea6b9a2e7063dc0368e331ecab6e7d5ca212813b94f5b13f1900e4aeae0ca21285a24ce55883b705d5879da8a2827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icon-naming-utils icon-naming-utils-devel pkgconfig(icon-naming-utils)"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/pkg-config perl-XML-Simple"

inherit rpm
