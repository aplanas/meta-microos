SUMMARY = "Compatibility metapackage for X.Org libraries"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org libraries."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "7.6.1"

RPM_NAME = "xorg-x11-libs-7.6.1-2.10.noarch.rpm"
RPM_HASH = "5ebaa79ed1a095ce51184910b63632bb5b25d262bbc8b5ca76eb40c7af308f96b765da00ba44d0a58498e0f7a4aced9682ec1f5a06a5a1a1ef4fb7307baadea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-libs"
RDEPENDS:${PN} += ""

inherit rpm
