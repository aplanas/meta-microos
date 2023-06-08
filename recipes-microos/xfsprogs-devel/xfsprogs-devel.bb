SUMMARY = "XFS Filesystem-specific Static Libraries and Headers"
DESCRIPTION = "xfsprogs-devel contains the libraries and header files needed to \
develop XFS file system-specific programs. \
 \
You should install xfsprogs-devel if you want to develop XFS file \
system-specific programs.  If you install xfsprogs-devel, you will also \
want to install xfsprogs."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "xfsprogs-devel-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "d011792f5e198c770f65c8550c9d05de9d4e94f52cc5a773fe965d59659b6ecbc2d841cb51df87780e91ba09401bfdc04b78c69d405d42cd94e5209fd1a481f9"

RPROVIDES:${PN} += "xfsprogs-devel xfsprogs-devel(aarch-64)"
RDEPENDS:${PN} += "libhandle1 libuuid-devel xfsprogs"

inherit rpm
