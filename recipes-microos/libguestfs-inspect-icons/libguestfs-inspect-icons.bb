SUMMARY = "Additional dependencies for inspecting guest icons"
DESCRIPTION = "libguestfs-inspect-icons is a metapackage that pulls in additional \
dependencies required by libguestfs to pull icons out of non-Linux \
guests.  Install this package if you want libguestfs to be able to \
inspect non-Linux guests and display icons from them. \
 \
The only reason this is a separate package is to avoid core libguestfs \
having to depend on Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-inspect-icons-1.50.1-3.1.noarch.rpm"
RPM_HASH = "aeb519a6824a5beaeee63d90b1bdfe725ca36b86fb4c03abd8bf87ed13da69da014b88c788d06a286af0ca7fcd338f2a7b6616f0e92eb92e7b8edbf95f88de87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-inspect-icons"
RDEPENDS:${PN} += "icoutils libguestfs"

inherit rpm
