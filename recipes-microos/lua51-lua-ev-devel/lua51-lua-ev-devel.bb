SUMMARY = "Header files for lua51-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua51-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua51-lua-ev-devel-1.5-4.2.aarch64.rpm"
RPM_HASH = "1dd2336bdb3fa040532c014ad4cda5e6b6aa78692f07cdbf643a49431346e4527bbab3c8b82bfa227517c18db26ac997e340875a8a203c234b5dd889c4d1d7d1"

RPROVIDES:${PN} += "lua51-lua-ev-devel lua51-lua-ev-devel(aarch-64)"
RDEPENDS:${PN} += "lua51-lua-ev"

inherit rpm
