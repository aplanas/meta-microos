SUMMARY = "File Server"
DESCRIPTION = "File services to host files so that they may be accessed or retrieved by other computers on the same network. This includes the FTP, SMB, and NFS protocols."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-file_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "4bcf85212d5f7c1d0ded7f9c3517397c09951344316cd7cc2be0fc0ee01f03fb15200f3d15a5ff65e2348ffda356f46566c6c7d87d9ac8b5e7f7ff57e91ddaf8"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-file_server patterns-server-file_server patterns-server-file_server(aarch-64)"
RDEPENDS:${PN} += "nfs-kernel-server pattern()"

inherit rpm
