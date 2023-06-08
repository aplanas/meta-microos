SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python310-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-doc-2.1.2-4.1.noarch.rpm"
RPM_HASH = "b64ab936c10c12ddd1544cab36cff05480154546d51a313e214948e8bed9dda3642edaf05e99411466cc11a0ae871167694e9afeba8cdc3e944d4e08250f06ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress-doc python310-waitress-doc"
RDEPENDS:${PN} += ""

inherit rpm
