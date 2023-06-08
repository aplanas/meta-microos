SUMMARY = "Header files for AppStream's Qt5 bindings"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using the Qt bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libAppStreamQt-devel-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "35bbf1abacb778ab9eeaf9f1ffc4e64d63dc83d988ac63bf1e5f038b3e8618b6fa15b8cd2b2ee33af7934247ce32bca99a7456d9ee944b199cc6e06591933167"

RPROVIDES:${PN} += "cmake(AppStreamQt) libAppStreamQt-devel libAppStreamQt-devel(aarch-64)"
RDEPENDS:${PN} += "libAppStreamQt2 libappstream4"

inherit rpm
