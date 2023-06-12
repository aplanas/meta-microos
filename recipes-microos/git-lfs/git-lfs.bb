SUMMARY = "Git extension for versioning large files"
DESCRIPTION = "Git Large File Storage (LFS) replaces large files such as audio samples, \
videos, datasets, and graphics with text pointers inside Git, while \
storing the file contents on a remote server."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "git-lfs-3.3.0-1.5.aarch64.rpm"
RPM_HASH = "6788989a860aa6dc241d899eca6ff511ba3be517c94d717c196521c41a6eda7d12d907d22c50f3f42b40e75441a1c1de5d251ccd46e81043065c1843f8311fff"

RPROVIDES:${PN} += "git-lfs git-lfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh git-core libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
