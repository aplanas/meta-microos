SUMMARY = "Japanese documentation for lxc"
DESCRIPTION = "Japanese language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "lxc-ja-doc-5.0.1-2.3.noarch.rpm"
RPM_HASH = "1a8c12be1b9b833bcb1865f0d9a3d27e3ca1fef5381a5f7b3baca8163ad89e731cac8911198c642007bb26b65bcabbc0a573884f05462f8c5d914e6326de1207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ja-doc"
RDEPENDS:${PN} += "lxc"

inherit rpm
