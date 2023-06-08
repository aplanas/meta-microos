SUMMARY = "OpenAFS shared library development"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package includes the static versions of libafsrpc and \
libafsauthent, and symlinks required for building against the dynamic \
libraries."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-authlibs-devel-1.8.9-2.9.aarch64.rpm"
RPM_HASH = "c86a329678050e36dc73b80222e520d3bd26fdbe52d84561987683bd440e800a591bf31298758271d2a254175d910fade313407e059cc5e783914dd878bdc12b"

RPROVIDES:${PN} += "openafs-authlibs-devel openafs-authlibs-devel(aarch-64)"
RDEPENDS:${PN} += "openafs-authlibs openafs-devel"

inherit rpm
