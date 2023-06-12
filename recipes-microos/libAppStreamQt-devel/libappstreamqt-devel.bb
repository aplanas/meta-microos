SUMMARY = "Header files for AppStream's Qt5 bindings"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using the Qt bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libAppStreamQt-devel-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "12e324995e6ce6f9a4be8ba0d964ebd4c72a4e823e9dc35fa603768090da2f533a9817f8f1ec7e76dacb938731265d68e89eed7585dd1fb4921256ed7bb95cbc"

RPROVIDES:${PN} += "cmake(AppStreamQt) \
libAppStreamQt-devel \
libAppStreamQt-devel(aarch-64)"
RDEPENDS:${PN} += "libAppStreamQt2 \
libappstream4"

inherit rpm
