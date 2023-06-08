SUMMARY = "Development files for liblockfile"
DESCRIPTION = "This library implements a number of functions found in -lmail on SysV \
systems. These functions are designed to lock the standard mailboxes in \
/var/mail (or wherever the system puts them). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblockfile."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "liblockfile-devel-1.17-1.2.aarch64.rpm"
RPM_HASH = "32daa92050cf7862fb9df8307c9ba7f3b7fe1efe2ee865987b38b1732a16118206f51718c2ef569e460f322d7522f93f430cef08e087bea3749dbf0557c16088"

RPROVIDES:${PN} += "liblockfile-devel liblockfile-devel(aarch-64)"
RDEPENDS:${PN} += "liblockfile1"

inherit rpm
