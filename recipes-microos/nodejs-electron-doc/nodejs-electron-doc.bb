SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.8"

RPM_NAME = "nodejs-electron-doc-22.3.8-1.2.noarch.rpm"
RPM_HASH = "2616fbbb0f46c7aeb7c3a256277fc75bde3f79914d330174fd0617fa0008e9cf425b3cd97ec903dbe3a9325e8dc4fd4920a50170b36b634bfbaec06c40996574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"
RDEPENDS:${PN} += ""

inherit rpm
