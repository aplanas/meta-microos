SUMMARY = "Debug information for package mingw32-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw32-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-debug-1.6.3-5.1.noarch.rpm"
RPM_HASH = "d9035ddca4366686bc00083be7f3f4b37b2bf24b76ec2074720994b4a80f70a2a1685f67f36bb90b81bfd03d4edda2a3bb4aa82e66889d71b3dc2a222976a7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-pkgconf-debug"
RDEPENDS:${PN} += ""

inherit rpm
