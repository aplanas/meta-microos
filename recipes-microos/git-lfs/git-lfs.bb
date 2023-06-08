SUMMARY = "Git extension for versioning large files"
DESCRIPTION = "Git Large File Storage (LFS) replaces large files such as audio samples, \
videos, datasets, and graphics with text pointers inside Git, while \
storing the file contents on a remote server."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "git-lfs-3.3.0-1.4.aarch64.rpm"
RPM_HASH = "7b679d771104d32049c08b1d0d27ba187210e0b51ad68e7b1f84ca97a915a8176b0e6c82a92eb0f6597d3c9f83037a215f36a91d554cc76c0e179f55b9d18f5b"

RPROVIDES:${PN} += "git-lfs git-lfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh git-core libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
